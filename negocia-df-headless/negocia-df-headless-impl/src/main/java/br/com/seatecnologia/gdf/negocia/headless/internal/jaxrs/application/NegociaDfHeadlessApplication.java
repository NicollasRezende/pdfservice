package br.com.seatecnologia.gdf.negocia.headless.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author sabrina
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/negocia-df-headless",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=NegociaDfHeadless"
	},
	service = Application.class
)
@Generated("")
public class NegociaDfHeadlessApplication extends Application {
}