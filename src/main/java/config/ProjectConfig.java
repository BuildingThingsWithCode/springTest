package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"proxies", "services", "repositories", "aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
