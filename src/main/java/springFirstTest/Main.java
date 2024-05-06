package springFirstTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Parrot p = context.getBean(Parrot.class);
		String greeting = context.getBean(String.class);
		Integer nr = context.getBean(Integer.class);
		System.out.println(p.getName());
		System.out.println(greeting);
		System.out.println(nr);
		context.close();
	}

}
