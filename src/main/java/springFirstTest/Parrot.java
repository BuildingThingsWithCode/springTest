package springFirstTest;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
	private String name= "James";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
