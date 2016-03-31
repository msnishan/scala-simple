package com.msnishan.scala.config

import org.springframework.context.annotation.{Bean, Configuration}
import com.msnishan.scala.model.Employee

/**
 * Created by ksaleh on 3/31/16.
 */
@Configuration
class AppConfig {

  @Bean def employee: Employee = new Employee("BhargoDev", "Arya")

}
