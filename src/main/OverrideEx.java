package main;

public class OverrideEx {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.say();
	}
}

class Animal {
	@Deprecated
	void say() {
		System.out.println("h");
	}
}

class Dog extends Animal {
	@Override	
	void say() {
		System.out.println("h");
	}
}