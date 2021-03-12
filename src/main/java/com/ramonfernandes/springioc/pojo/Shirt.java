package com.ramonfernandes.springioc.pojo;

import com.ramonfernandes.springioc.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Shirt implements ItemObject {

    private String type;

    public Shirt() {
        this.type = "Camiseta";
    }

    @Override
    public String getType() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            AppConfig.class);

        SingletonMap map = context.getBean(SingletonMap.class);
        map.getMap().put(map.getMap().keySet().size(), type);

        return type;
    }
}
