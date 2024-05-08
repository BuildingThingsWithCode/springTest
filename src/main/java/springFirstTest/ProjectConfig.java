package springFirstTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
	
	@Bean
	Parrot parrot() {
		Parrot p = new Parrot();
		p.setName("Talky the bird");
		return p;
	}
	
	@Bean 
	Person person(Parrot parrot) {
		Person p = new Person();
		p.setName("Dirk Diggler");
		p.setParrot(parrot);
		return  p;
	}

}
