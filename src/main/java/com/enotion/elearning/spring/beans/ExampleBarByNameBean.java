package com.enotion.elearning.spring.beans;

import com.enotion.elearning.spring.services.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExampleBarByNameBean {

    /**
     * @Autowiring byType not matched, so use byName to try - check spring-config.xml - there are two beans with this type
     */
    BarService barServiceOne;

    /**
     * @Autowiring byType not matched, so use byName, not matched - so Qualifier need to be used - there are two beans with this type
     */
    @Autowired
    @Qualifier("barServiceTwo")
    BarService barService;



    public void execute(){
        System.out.println("Exec ExampleBarByNameBean...");
        barServiceOne.bar(); //output: BarServiceImplOne
        barService.bar(); //output: BarServiceImplTwo
    }

    public void setBarServiceOne(BarService barServiceOne) {
        this.barServiceOne = barServiceOne;
    }

}
