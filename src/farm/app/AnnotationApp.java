package farm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import farm.config.AppConfiguration;

public class AnnotationApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	}

}
