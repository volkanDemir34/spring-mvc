package main;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		String name = "Volkan2";
		Optional<String> name2 = name;
		System.out.println(name2.orElse("Volkan"));
		
	}

}
