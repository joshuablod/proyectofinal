package com.lara.proyectofinaljava3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan("com.lara.proyectofinaljava3")
public class WebAppConfig extends WebMvcConfigurerAdapter{
    
}
