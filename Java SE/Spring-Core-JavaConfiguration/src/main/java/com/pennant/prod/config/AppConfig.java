package com.pennant.prod.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value = { @ComponentScan("com.pennant.prod.dao"), @ComponentScan("com.pennant.prod.service") })
public class AppConfig {

}
