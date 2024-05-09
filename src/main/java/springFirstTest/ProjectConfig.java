package springFirstTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages= "springFirstTest")
public class ProjectConfig {
	
	@Bean
	Parrot parrot1() {
		Parrot p = new Parrot();
		p.setName("Talky the bird");
		return p;
	}
	
	@Bean
	Parrot parrot2() {
		Parrot p = new Parrot();
		p.setName("Koko");
		return p;
	}

}
