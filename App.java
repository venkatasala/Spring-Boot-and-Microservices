package com.venkat;

import com.venkat.jbased.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
        //Desktop dt=context.getBean("com",Desktop.class);
        Desktop dt=context.getBean(Desktop.class);
        dt.compile();
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        //System.out.println( "Hello World!" );
//        Alien a= (Alien) context.getBean("alien");
//        //a.setAge(21);
//        System.out.println(a.getAge());
//        a.code();
//        Desktop d=context.getBean(Desktop.class);
    }
}
