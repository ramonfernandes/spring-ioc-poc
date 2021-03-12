package com.ramonfernandes.springioc.pojo;

public class Shirt implements ItemObject {

    private String type;

    public Shirt() {
        this.type = "Camiseta";
    }

    @Override
    public String getType() {
        return type;
    }
}
