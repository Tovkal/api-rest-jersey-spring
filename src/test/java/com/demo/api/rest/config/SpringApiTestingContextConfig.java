package com.demo.api.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demo.api.rest.mock"})
public class SpringApiTestingContextConfig {
}
