package com.msnishan.scala

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import com.msnishan.scala.config.AppConfig
import com.msnishan.scala.model.Employee

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))

    val ctx: ApplicationContext = new AnnotationConfigApplicationContext(classOf[AppConfig])
    val emp: Employee = ctx.getBean(classOf[Employee])
    println(emp)

  }

}
