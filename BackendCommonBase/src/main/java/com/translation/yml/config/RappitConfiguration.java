package com.translation.yml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application_context_${spring.profiles.active}.properties")
@Configuration
public class RappitConfiguration {

}
