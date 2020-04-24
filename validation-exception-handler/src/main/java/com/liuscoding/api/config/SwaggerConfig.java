package com.liuscoding.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger 配置类
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * 是否启用swagger文档
     */
    @Value("${swagger.enable}")
    private boolean enable;

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .apiInfo(apiInfo())
                .select()
                //这里配置要扫描的包，接口在哪个包就配置哪个包
                .apis(RequestHandlerSelectors.basePackage("com.liuscoding.api.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("参数校验和统一异常处理Demo")
                .description("演示参数校验和统一异常处理")
                .termsOfServiceUrl("liuscoding")
                .contact(new Contact("liusCoding","liuscoding.cn","liuscoding@163.com"))
                .version("1.0")
                .build();
    }
}
