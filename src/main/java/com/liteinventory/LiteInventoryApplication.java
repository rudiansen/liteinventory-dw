package com.liteinventory;

import com.liteinventory.ui.MyUI;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LiteInventoryApplication extends Application<LiteInventoryConfiguration> {

	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class Servlet extends VaadinServlet {
		
		private static final long serialVersionUID = 1123127177711L;
		// Empty
	}
    public static void main(final String[] args) throws Exception {
        new LiteInventoryApplication().run(args);
    }    
        
    @Override
    public String getName() {
        return "Lite Inventory Application";
    }

    @Override
    public void initialize(final Bootstrap<LiteInventoryConfiguration> bootstrap) {
    	bootstrap.addBundle(new LiteInventoryBundle(Servlet.class, "/vaadin/*"));
    	
    	bootstrap.addBundle(new AssetsBundle("/VAADIN", "/VAADIN", null));
    	
    	bootstrap.addBundle(new MigrationsBundle<LiteInventoryConfiguration>() {
        	@Override
        	public PooledDataSourceFactory getDataSourceFactory(LiteInventoryConfiguration configuration) {        		
        		return configuration.getDataSourceFactory();
        	}        	
		});
    	    	
    }

    @Override
    public void run(final LiteInventoryConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
