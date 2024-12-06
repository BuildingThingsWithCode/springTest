package springFirstTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages= "springFirstTest")
public class ProjectConfig {
	
	@Bean
	public Parrot parrot2() {
	Parrot p = new Parrot();
	p.setName("DeezNuts");
	return p;
	}

}
