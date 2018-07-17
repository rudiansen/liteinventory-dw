package com.liteinventory;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LiteInventoryApplication extends Application<LiteInventoryConfiguration> {

    public static void main(final String[] args) throws Exception {
        new LiteInventoryApplication().run(args);
    }

    @Override
    public String getName() {
        return "Lite Inventory Application";
    }

    @Override
    public void initialize(final Bootstrap<LiteInventoryConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final LiteInventoryConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
