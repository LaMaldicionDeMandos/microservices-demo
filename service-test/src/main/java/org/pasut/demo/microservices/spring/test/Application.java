package org.pasut.demo.microservices.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@ComponentScan
@EnableAutoConfiguration //como agregue la dependencia web (tomcat + spring MVC), asume que estoy creando una aplicacion web
@RefreshScope
@EnableEurekaClient
public class Application {
    private final static Logger log = LoggerFactory.getLogger(Application.class);

    @RequestMapping("/")
    String hello(@Value("${greeting}") String hello) {
        log.info("Call to hello: " + hello);
        return hello;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
