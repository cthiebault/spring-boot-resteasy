package com.github.cthiebault;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap;
import org.jboss.resteasy.plugins.spring.SpringContextLoaderSupport;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

@Configuration
public class RestEasyConfig implements ServletContextInitializer {

  public static final String WS_ROOT = "/ws";

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    servletContext.setInitParameter("resteasy.servlet.mapping.prefix", WS_ROOT);

    servletContext.addListener(ResteasyBootstrap.class.getName());
    servletContext.addListener(Spring4ContextLoaderListener.class.getName());

    ServletRegistration.Dynamic resteasyServlet = servletContext.addServlet("resteasy", HttpServletDispatcher.class);
    resteasyServlet.addMapping(WS_ROOT + "/*");
  }

  // https://issues.jboss.org/browse/RESTEASY-1012
  public static class Spring4ContextLoaderListener extends ContextLoaderListener {

    private final SpringContextLoaderSupport springContextLoaderSupport = new SpringContextLoaderSupport();

    @Override
    protected void customizeContext(ServletContext servletContext,
        ConfigurableWebApplicationContext configurableWebApplicationContext) {
      super.customizeContext(servletContext, configurableWebApplicationContext);
      springContextLoaderSupport.customizeContext(servletContext, configurableWebApplicationContext);
    }
  }
}
