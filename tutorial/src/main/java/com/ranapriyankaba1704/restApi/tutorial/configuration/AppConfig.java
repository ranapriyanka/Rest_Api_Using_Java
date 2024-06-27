package com.ranapriyankaba1704.restApi.tutorial.configuration;

import com.ranapriyankaba1704.restApi.tutorial.DB;
import com.ranapriyankaba1704.restApi.tutorial.DevDB;
import com.ranapriyankaba1704.restApi.tutorial.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getDevDBBean(){
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDBBean(){
        return new ProdDB();
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
