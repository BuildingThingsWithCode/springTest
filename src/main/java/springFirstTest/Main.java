package springFirstTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Person person1 = context.getBean(Person.class);
		System.out.println("person name= "+person1.getName());
		System.out.println("person's parrot= "+person1.getParrot());
		context.close();
	}

}
