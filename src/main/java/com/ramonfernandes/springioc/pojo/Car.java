package com.ramonfernandes.springioc.pojo;

import com.ramonfernandes.springioc.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Car implements ItemObject {

    private String type;

    public Car() {
        this.type = "Carro";
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
