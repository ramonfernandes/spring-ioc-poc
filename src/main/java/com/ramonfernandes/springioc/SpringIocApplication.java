package com.ramonfernandes.springioc;

import com.ramonfernandes.springioc.components.TestService;
import com.ramonfernandes.springioc.pojo.ItemObject;
import com.ramonfernandes.springioc.pojo.SingletonMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

@SpringBootApplication
public class SpringIocApplication {

	@Autowired
	public static TestService testService;

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ItemObject bean = context.getBean("car", ItemObject.class);
		System.out.println("Isso aqui é um carro: " + bean.getType());

		bean = context.getBean("book", ItemObject.class);
		System.out.println("Isso aqui não é um carro: " + bean.getType());

		bean = context.getBean(ItemObject.class);
		System.out.println("E se eu não passo nada vem o  primario: " + bean.getType());

//		System.out.println("As spring annotations funcionam? " + testService.service());

		SingletonMap map = context.getBean(SingletonMap.class);
		System.out.printf(map.toString());
	}

}
