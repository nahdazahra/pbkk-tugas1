package farm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import farm.model.di.Farm;

public class XMLApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("farmbean.xml");
		Farm f1 = context.getBean("farm1", Farm.class);
		Farm f2 = context.getBean("farm2", Farm.class);
		Farm f3 = context.getBean("farm3", Farm.class);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}
	
}
