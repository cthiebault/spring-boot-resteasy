package com.github.cthiebault;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@EnableAutoConfiguration
public class Application {

  public static void main(String... args) throws Exception {
    new SpringApplicationBuilder(Application.class).showBanner(false).run(args);
  }

  @Configuration
//  @AutoConfigureAfter(FaviconConfiguration.class)
  @ImportResource("classpath:springmvc-resteasy.xml")
  public class RestEasyXmlConfig {

  }

  //  @Configuration
//  public static class FaviconConfiguration {
//
//    @Bean
//    public SimpleUrlHandlerMapping faviconHandlerMapping() {
//      SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
//      mapping.setOrder(Integer.MIN_VALUE);
//      mapping.setUrlMap(Collections.singletonMap("mylocation/favicon.ico", faviconRequestHandler()));
//      return mapping;
//    }
//
//    @Bean(name = "faviconRequestHandler")
//    protected ResourceHttpRequestHandler faviconRequestHandler() {
//      ResourceHttpRequestHandler requestHandler = new ResourceHttpRequestHandler();
//      requestHandler.setLocations(Arrays.<Resource>asList(new ClassPathResource("/")));
//      return requestHandler;
//    }
//  }

}



