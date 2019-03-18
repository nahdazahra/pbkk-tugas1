package farm.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import farm.config.AppConfiguration;
import farm.model.di.Farm;

public class JavaConfApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Farm farm1 = context.getBean("rabbitFarmer", Farm.class);
		Farm farm2 = context.getBean("horseFarmer", Farm.class);
		Farm farm3 = context.getBean("duckFarmer", Farm.class);
		
		System.out.println(farm1);
		System.out.println(farm2);
		System.out.println(farm3);

	}

}
