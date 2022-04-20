package com.training.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.bean.AddOperator;
import com.training.bean.HelloWorld;
import com.training.bean.OperatorDemo;
import com.training.config.AppConfig;
import com.training.interfaces.Operator;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
    		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    		Operator demo = (Operator) context.getBean("multiplyOperator");
//    		demo.operator(12, 23);

    		
    		OperatorDemo demo = (OperatorDemo) context.getBean(OperatorDemo.class);
    		demo.printResult(12, 23);
    }
}
