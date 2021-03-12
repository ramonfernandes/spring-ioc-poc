package com.ramonfernandes.springioc;

import com.ramonfernandes.springioc.pojo.Book;
import com.ramonfernandes.springioc.pojo.Car;
import com.ramonfernandes.springioc.pojo.ItemObject;
import com.ramonfernandes.springioc.pojo.Shirt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {


    @Bean
    @Primary
    public ItemObject primary() {
        return new Shirt();
    }

    @Bean(name = "car")
    public ItemObject car() {
        return new Car();
    }

    @Bean(name = "book")
    public ItemObject book() {
        return new Book();
    }

}
