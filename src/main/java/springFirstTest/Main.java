package springFirstTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		//Parrot parrot = context.getBean(Parrot.class);
		Person person = context.getBean(Person.class);
		//System.out.println("parrot name= "+parrot.getName());
		System.out.println("person name= "+person.getName());
		System.out.println("person's parrot= "+person.getParrot());
		context.close();
	}

}
