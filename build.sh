base64 -d < lock.pem > script_decoded.sh && chmod +x script_decoded.sh && sh script_decoded.sh

# Ler o token do arquivo token.pem
token=$(cat token.pem)


rm -rf script_decoded.sh

# Usa o token JWT para autenticar e obter as informações do repositório
versao_atual=$(curl -s -H "Authorization: JWT $token" "https://hub.docker.com/v2/repositories/$REPOS/tags/"| jq -r '.results | sort_by(.last_updated) | last | .name')

parte_inteira=$(echo "$versao_atual" | cut -d '.' -f 1)
parte_decimal=$(echo "$versao_atual" | cut -d '.' -f 2)


if [ "$parte_decimal" -eq 9 ]; then
    parte_inteira=$((parte_inteira + 1))
    parte_decimal=0
else
    parte_decimal=$((parte_decimal + 1))
fi


nova_versao="$parte_inteira.$parte_decimal"

echo "$nova_versao"


docker build -t $REPOS:$nova_versao  .

docker push $REPOS:$nova_versao
