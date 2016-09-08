package com.samples.embedded.id;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by edara on 9/6/16.
 */
public class MainEx3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);
        ServiceEx3 service = (ServiceEx3) context.getBean("serviceEx3");
        service.run();
        System.out.println("Done");

    }

}
