package com.pennat.emp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value= {@ComponentScan("com.pennat.emp.service"),@ComponentScan("com.pennat.emp.dao"),@ComponentScan("com.pennat.emp.aspects")})
public class AppConfig {

}
