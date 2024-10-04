package com.myorganisation.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);

		// IOC DI using ApplicationContext
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("App.xml");

		Student student1 = (Student) applicationContext.getBean("student");

		System.out.println(student1.getName());
		System.out.println(student1.getAge());

		// IOC DI using Autowiring
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("App.xml");
		Employee employee1 = (Employee) applicationContext1.getBean("employee");

		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getAddress().getCountry());

	}

}