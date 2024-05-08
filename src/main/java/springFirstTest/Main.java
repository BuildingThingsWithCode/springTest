package springFirstTest;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Parrot p = new Parrot();
		p.setName("Dave");
		Supplier<Parrot> parrotSupplier = () -> p;
		context.registerBean("parrot1",Parrot.class, parrotSupplier, l->l.setPrimary(true));
		System.out.println(p.getName());
		
		context.close();
	}

}
