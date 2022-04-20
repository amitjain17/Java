package com.training.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    		HelloWorld hw = (HelloWorld)context.getBean("hello");
    		System.out.println(hw.sayhello());
    }
}
