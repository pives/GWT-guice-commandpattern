package com.philadev.cpexample.server;

import net.customware.gwt.dispatch.server.service.DispatchServiceServlet;

import com.google.inject.servlet.ServletModule;

public class DispatchServletModule extends ServletModule {
    @Override
    public void configureServlets() {
        serve( "/GCPExample/dispatch" ).with( DispatchServiceServlet.class );
    }
}
