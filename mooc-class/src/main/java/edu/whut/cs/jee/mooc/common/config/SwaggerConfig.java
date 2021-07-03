package edu.whut.cs.jee.mooc.common.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey(),apiKey1()))
                ;
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Mooc API Doc")
                .description("这是mooc的api文档。")
                .contact(new Contact("况阳","niter.cn","kuaileky@qq.com"))
                .version("1.0")
                .build();
    }

    private ApiKey apiKey() {
        return new ApiKey("token", "Authorization", "header");
    }
    private ApiKey apiKey1() {
        return new ApiKey("token1", "Authorization-x", "header");
    }
}
