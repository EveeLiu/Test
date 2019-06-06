package com.bgy.thjx.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class thjxSwagger {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().apis(requestHandler -> {
                    String packageName =
                            requestHandler
                                    .getHandlerMethod()
                                    .getMethod()
                                    .getDeclaringClass()
                                    .getPackage()
                                    .getName();
                    return  packageName.startsWith("com.bgy.thjx") && packageName.contains("controller");
                })
//                .apis(RequestHandlerSelectors.basePackage("com.bgy.thjx"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("潼湖军校管理系统")
                .description("api文档接口")
                .contact("青年军")
                .version("1.0")
                .build();
    }

}