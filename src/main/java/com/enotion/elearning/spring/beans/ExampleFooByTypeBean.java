package com.enotion.elearning.spring.beans;

import com.enotion.elearning.spring.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class ExampleFooByTypeBean {

    /**
     * @Autowire byType - check spring-config.xml
     */
    private FooService fooServiceXYZ;

    /**
     * @Resource is equivalent to @Autowired
     */
    @Resource
    private FooService fooServiceTwo;

    public void execute() {

        fooServiceXYZ.foo();

        fooServiceTwo.foo();
    }

    public void setFooService(FooService fooService) {
        this.fooServiceXYZ = fooService;
    }
}