package com.uniin.mybatisPlus.config;

import com.google.common.base.Predicates;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * swagger2配置类，用于配置swagger2分组
 *
 * @author zhangyy
 */
@Configuration
@ConditionalOnProperty(prefix = "swagger",value = {"enable"},havingValue = "true")
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 创建API
     */
    @Bean
    public Docket createRestApi() {
        return new Docket( DocumentationType.SWAGGER_2 )
                .apiInfo( apiInfo() )
                .select()
                /**
                 * 第一种方式扫描所有有注解的api，用这种方式更灵活
                 * .apis( RequestHandlerSelectors.withMethodAnnotation( ApiOperation.class ) )
                 * 第二种方式扫描指定包中的swagger注解
                 * .apis(RequestHandlerSelectors.basePackage("com.uniin.mybatisPlus.controller"))
                 */
                 //第三种方式扫描所有
                .apis(RequestHandlerSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title( "MybatisPlus测试API文档" )
                .description( "向前端提供MybatisPlus测试ResultFul风格接口文档" )
                .contact( "zhangyy" )
                .termsOfServiceUrl("NO terms of service")
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("V1.0.0" )
                .build();
    }
}
