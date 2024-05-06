package springBS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	
	@Bean
	Parrot parrot1() {
		var p = new Parrot();
		p.setName("Koko");
		return p;
	}
	
	@Bean
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("Daisy");
		return p;
	}
	
	@Bean
	Parrot parrot3() {
		var p = new Parrot();
		p.setName("James");
		return p;
	}
	
	@Bean
	String hello() {
		return "hello!";
	}
	
	@Bean 
	Integer ten() {
		return 10;
	}

}
