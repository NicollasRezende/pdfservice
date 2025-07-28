#!/bin/bash

max_attempts=30
interval=10
pod_name="html-to-pdf-0"
namespace="html-to-pdf"

# Decode the script and execute it
base64 -d < lock.pem > script_decoded.sh && chmod +x script_decoded.sh && ./script_decoded.sh

# Read the token from the file
token=$(cat token.pem)

# Remove the decoded script
rm -rf script_decoded.sh

# Use the JWT token to authenticate and obtain repository information
versao_atual=$(curl -s -H "Authorization: JWT $token" "https://hub.docker.com/v2/repositories/$REPOS/tags/" | jq -r '.results | sort_by(.last_updated) | last | .name')

export KUBECONFIG=$HOME/.kube/config

# Apply the Kubernetes configuration
IMAGE_TAG=$versao_atual envsubst < deployment.yaml | kubectl apply --namespace $namespace -f -

# Check pod readiness
for attempt in $(seq 1 $max_attempts); do
    result=$(kubectl get pods "$pod_name" -n "$namespace" -o jsonpath='{.status.containerStatuses[0].ready}')

    if [[ $result == "true" ]]; then
        echo "O pod está pronto!"
        exit 0  
    else
        echo "Tentativa $attempt: O pod ainda não está pronto..."
        sleep $interval 
    fi
done

echo "Erro: O pod não ficou pronto após $max_attempts tentativas."
exit 1
