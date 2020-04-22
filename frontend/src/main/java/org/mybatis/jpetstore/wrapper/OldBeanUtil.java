/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.jpetstore.wrapper;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.cloud.openfeign.FeignClientBuilder.Builder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class OldBeanUtil implements ApplicationContextAware {
  public static ApplicationContext context;

  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.context = applicationContext;

  }

  public static <T> T getBean(Class<T> beanClass) {
    return context.getBean(beanClass);
  }

  // @PostConstruct
  // public void initialize() {
  // FeignClientBuilder builder = new FeignClientBuilder(context);
  // Builder<CatalogTemplate> test = builder.forType(CatalogTemplate.class, "catalogTemplate");
  // System.out.println("createCatalogService : " + test.build().createCatalogService());
  // builder.forType(OrderTemplate.class, "orderTemplate").build();
  // builder.forType(AccountTemplate.class, "accountTemplate").build();
  // System.out.println("test123");
  // for (String beanDef : context.getBeanDefinitionNames()) {
  // System.err.println(beanDef);
  // }
  // }
}
