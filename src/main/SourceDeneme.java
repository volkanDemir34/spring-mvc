package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SourceDeneme {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("resources/EBYN.xsd")));
		String value ;
		while(( value = br.readLine())!=null) {
			System.out.println(value);
		}
	}

}
