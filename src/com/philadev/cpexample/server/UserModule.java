package com.philadev.cpexample.server;

import net.customware.gwt.dispatch.server.guice.ActionHandlerModule;

public class UserModule extends ActionHandlerModule {

	@Override
	protected void configureHandlers() {
		bindHandler(GetUsersHandler.class);
	}

}
