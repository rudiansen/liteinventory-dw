package com.liteinventory;

import java.util.Map;

import javax.servlet.Servlet;

import org.eclipse.jetty.server.session.SessionHandler;

import com.google.common.collect.Maps;

import io.dropwizard.Bundle;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LiteInventoryBundle implements Bundle {

	private final Map<String, Class<? extends Servlet>> servlets = Maps.newLinkedHashMap();
	
	private final SessionHandler sessionHandler;
	
	public LiteInventoryBundle(Class<? extends Servlet> servlet, String pathSpec) {
		this.sessionHandler = new SessionHandler();
		servlets.put(pathSpec, servlet);
	}
	
	@Override
	public void initialize(Bootstrap<?> bootstrap) {
		bootstrap.addBundle(new AssetsBundle("/VAADIN", "/VAADIN", null, "vaadin"));
	}

	@Override
	public void run(Environment environment) {
		environment.servlets().setSessionHandler(sessionHandler);
		for (Map.Entry<String, Class<? extends Servlet>> servlet : servlets.entrySet()) {
			environment.getApplicationContext().addServlet(servlet.getValue(), servlet.getKey());
		}
	}

}
