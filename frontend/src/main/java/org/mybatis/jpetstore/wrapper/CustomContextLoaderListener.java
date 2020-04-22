package org.mybatis.jpetstore.wrapper;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ContextLoaderListener;

import feign.Client;
import feign.Feign;
import net.sourceforge.stripes.config.RuntimeConfiguration;

@Configuration
public class CustomContextLoaderListener extends ContextLoaderListener {
}
