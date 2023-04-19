package com.imooc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


public class Configuration {
    @Bean
    public CorsFilter corsFileter(){
     CorsConfiguration corsConfiguration = new CorsConfiguration();
     corsConfiguration.addAllowedHeader("*");
     corsConfiguration.addAllowedOrigin("*");
     corsConfiguration.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsFilter(source);

    }
}
