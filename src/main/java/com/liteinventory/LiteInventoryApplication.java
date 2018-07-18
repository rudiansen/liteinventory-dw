package com.liteinventory;

import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LiteInventoryApplication extends Application<LiteInventoryConfiguration> {

    public static void main(final String[] args) throws Exception {
        new LiteInventoryApplication().run(args);
    }

    private final HibernateBundle<LiteInventoryConfiguration> hibernateBundle = 
    		new HibernateBundle<LiteInventoryConfiguration>(Person.class) {
    			@Override
    			public PooledDataSourceFactory getDataSourceFactory(LiteInventoryConfiguration configuration) {
    				return configuration.getDataSourceFactory();
    			}    	
        };
        
    @Override
    public String getName() {
        return "Lite Inventory Application";
    }

    @Override
    public void initialize(final Bootstrap<LiteInventoryConfiguration> bootstrap) {
    	bootstrap.addBundle(new MigrationsBundle<LiteInventoryConfiguration>() {
        	@Override
        	public PooledDataSourceFactory getDataSourceFactory(LiteInventoryConfiguration configuration) {        		
        		return configuration.getDataSourceFactory();
        	}        	
		});
    	
    	bootstrap.addBundle(hibernateBundle);
    }

    @Override
    public void run(final LiteInventoryConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
