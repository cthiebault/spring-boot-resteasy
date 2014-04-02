package com.github.cthiebault;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class Application {

  public static void main(String... args) throws Exception {
    new SpringApplicationBuilder(Application.class).showBanner(false).run(args);
  }
}