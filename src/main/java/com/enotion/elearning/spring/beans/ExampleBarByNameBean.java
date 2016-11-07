package com.enotion.elearning.spring.beans;

import com.enotion.elearning.spring.services.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExampleBarByNameBean {

    /**
     * @Autowiring byName - check spring-config.xml
     */
    BarService barServiceOne;

    /**
     * @Autowiring byName not matched - so Qualifier need to be used
     */
    @Autowired
    @Qualifier("barServiceTwo")
    BarService barService;



    public void execute(){
        barServiceOne.bar(); //output: BarServiceImplOne
        barService.bar(); //output: BarServiceImplTwo
    }

    public void setBarServiceOne(BarService barServiceOne) {
        this.barServiceOne = barServiceOne;
    }

}
