package com.example.client;
import com.example.demo.Car; 
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainRunner {

	public static void main(String[] args) {
		
		// Spring container 
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("demo.xml");
		Car car = (Car)spring.getBean("carNewCar");
		System.out.println(car);
		
		
/*
		 * Car car2 = (Car)spring.getBean("carNewCar2");
		 * System.out.println("First Call :- "+car2); Car car3 =
		 * (Car)spring.getBean("carNewCar2"); System.out.println(" Second Call "+car3);
		 */
		
		
		
		
		

		
		spring.close();
		
	}
}
		
		
		
			
				
	

