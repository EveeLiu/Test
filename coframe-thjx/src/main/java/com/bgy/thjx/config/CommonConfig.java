package com.bgy.thjx.config;

import com.bgy.thjx.utils.IdWorker;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

@Configuration
public class CommonConfig {

    public static Predicate<String> paths() {
        return Predicates.alwaysTrue();
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(0,1);
    }


    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedHeaders("*")
                        .allowedMethods("*")
                        .allowedOrigins("*");
            }
        };
    }

    @Bean
    public Converter<String, Date> dateToTimestampConverter() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String source) {
                return new Date(Long.parseLong(source, 10));
            }
        };
    }

    @Bean
    public Converter<String, LocalDateTime> localDateTimeToTimestampConverter() {
        return new Converter<String, LocalDateTime>() {
            @Override
            public LocalDateTime convert(String source) {
                return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(source, 10)),
                        TimeZone.getDefault().toZoneId());
            }
        };
    }

}
