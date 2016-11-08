package com.enotion.elearning.spring;

import com.enotion.elearning.spring.beans.ExampleBarByNameBean;
import com.enotion.elearning.spring.beans.ExampleFooByTypeBean;
import com.enotion.elearning.spring.beans.ExampleJoeDefaultBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-config.xml");

        ExampleFooByTypeBean exampleFooByTypeBean = (ExampleFooByTypeBean) ctx.getBean("exampleFooByTypeBean");
        System.out.println("Execute ExampleFooByTypeBean...");
        exampleFooByTypeBean.execute();

        ExampleBarByNameBean exampleBarByNameBean = (ExampleBarByNameBean) ctx.getBean("exampleBarByNameBean");
        System.out.println("Execute ExampleBarByNameBean...");
        exampleBarByNameBean.execute();

        ExampleJoeDefaultBean exampleBarByNameBean1 = (ExampleJoeDefaultBean) ctx.getBean("exampleJoeDefaultBean");
        System.out.println("Execute ExampleJoeDefaultBean...");
        exampleBarByNameBean1.execute();

    }
}
