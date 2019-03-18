package farm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import farm.model.di.Address;
import farm.model.di.Animal;
import farm.model.di.Farm;

@Configuration
public class AppConfiguration {
	
	@Bean
	public Address rabbitAddr() {
		return new Address();
	}
	
	@Bean
	public Address horseAddr() {
		return new Address();
	}
	
	@Bean
	public Address duckAddr() {
		return new Address();
	}
	
	@Bean
	public Animal rabbitAnm() {
		return new Animal();
	}
	
	@Bean
	public Animal horseAnm() {
		return new Animal();
	}
	
	@Bean
	public Animal duckAnm() {
		return new Animal();
	}
	
	@Bean
	public Farm rabbitFarmer() {
		Farm myRabbit = new Farm(null, rabbitAddr(), rabbitAnm());
		return myRabbit;
	}
	
	@Bean
	public Farm horseFarmer() {
		Farm myHorse = new Farm(null, horseAddr(), horseAnm());
		return myHorse;
	}
	
	@Bean
	public Farm duckFarmer() {
		Farm myDuck = new Farm(null, duckAddr(), duckAnm());
		return myDuck;
	}
	
}
