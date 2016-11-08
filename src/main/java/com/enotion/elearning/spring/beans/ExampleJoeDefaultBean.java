package com.enotion.elearning.spring.beans;

import com.enotion.elearning.spring.services.BarService;

public class ExampleJoeDefaultBean {

    private BarService barService;

    public void execute() {

        System.out.println("Exec ExampleJoeDefaultBean...");

        if (barService != null) {
            barService.bar();
        } else {
            System.out.println("Autowire is not attached as a xml config nor @Autowired annotation so service is null.");
        }
    }

    public void setBarService(BarService barService) {
        this.barService = barService;
    }
}
