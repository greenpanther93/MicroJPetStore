package org.mybatis.jpetstore.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
@EnableDiscoveryClient
@EnableFeignClients
public class CatalogApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CatalogApp.class, args);
//        for(String beanDef : context.getBeanDefinitionNames()){
//        	System.err.println(beanDef);
//        }
    }
}

