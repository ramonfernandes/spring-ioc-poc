package com.ramonfernandes.springioc.pojo;

public class Book implements ItemObject {

    private String type;

    public Book() {
        this.type = "Livro";
    }

    @Override
    public String getType() {
        return type;
    }
}
