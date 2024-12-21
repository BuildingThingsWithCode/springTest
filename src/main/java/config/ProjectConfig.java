package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import proxies.EmailCommentNotificationProxy;

@Configuration
@ComponentScan(basePackages = {"proxies", "services", "repositories"})
public class ProjectConfig {
	
	EmailCommentNotificationProxy emailCommentNotificationProxy() {
		return new EmailCommentNotificationProxy();
	}

}
