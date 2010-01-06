package com.philadev.cpexample.server.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.philadev.cpexample.server.DispatchServletModule;
import com.philadev.cpexample.server.UserModule;

public class MyGuiceServletConfig extends GuiceServletContextListener {

	@Override
	 protected Injector getInjector() {
		  return Guice.createInjector(new UserModule(), new DispatchServletModule());
		 }
}
