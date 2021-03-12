package com.ramonfernandes.springioc.components;

import org.springframework.stereotype.Component;

@Component
public class TestRepository {

    public TestRepository() {
    }

    public String repository() {
        return "Sim";
    }

}
