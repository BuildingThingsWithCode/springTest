package springFirstTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class ProjectConfig {
	
	@Bean
	String hello() {
		return "hello!";
	}
	
	@Bean 
	Integer ten() {
		return 10;
	}

}
