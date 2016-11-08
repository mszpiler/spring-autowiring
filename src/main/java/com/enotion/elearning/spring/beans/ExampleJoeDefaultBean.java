package com.enotion.elearning.spring.beans;

import com.enotion.elearning.spring.services.BarService;

import javax.annotation.Resource;
import javax.inject.Inject;

public class ExampleJoeDefaultBean {

    private BarService barService;

    /**
     * @Inject search bean byType - BarService in spring configuration has two beans, so there is a problem with injection
     */
//    @Inject
//    private BarService barServiceInject;

    /**
     * @Resource search bean byName, matched - check spring-config.xml
     */
    @Resource
    private BarService barServiceThree;

    public void execute() {

        System.out.println("Exec ExampleJoeDefaultBean...");

        if (barService != null) {
            barService.bar();
        } else {
            System.out.println("Autowire is not attached as a xml config nor @Autowired annotation so service is null.");
        }

        barServiceThree.bar();
    }

    public void setBarService(BarService barService) {
        this.barService = barService;
    }
}
