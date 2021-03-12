package com.ramonfernandes.springioc.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

    @Autowired
    private TestRepository repository;

    public TestService(TestRepository repository) {
        this.repository = repository;
    }

    public String service() {
        return repository.repository();
    }

}
