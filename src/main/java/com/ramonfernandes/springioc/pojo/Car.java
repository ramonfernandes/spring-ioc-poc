package com.ramonfernandes.springioc.pojo;

public class Car implements ItemObject {

    private String type;

    public Car() {
        this.type = "Carro";
    }

    @Override
    public String getType() {
        return type;
    }

}
