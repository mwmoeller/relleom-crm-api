package com.relleom.crm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.Validator;

@Configuration
public class CustomRepositoryRestConfigurerAdapter extends RepositoryRestConfigurerAdapter {

   @Bean
   public Validator validator() {
       return new LocalValidatorFactoryBean();
   }

   @Override
   public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
       validatingListener.addValidator("afterCreate", validator());
       validatingListener.addValidator("beforeCreate", validator());
       validatingListener.addValidator("afterSave", validator());
       validatingListener.addValidator("beforeSave", validator());
   }
}