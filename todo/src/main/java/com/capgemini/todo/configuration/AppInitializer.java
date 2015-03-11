package com.capgemini.todo.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
public class AppInitializer implements WebApplicationInitializer {
	 @Override
	    public void onStartup(javax.servlet.ServletContext container) throws ServletException {
	      AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
	      rootContext.register(AppConfig.class);
	      ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootContext));
	      dispatcher.setLoadOnStartup(1);
	      dispatcher.addMapping("/");
	    }
}
