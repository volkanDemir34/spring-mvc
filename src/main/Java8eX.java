package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8eX {
	
	private static boolean prime(int number) {
		if(number<2) return false;
		for(int i=2;i<number;i++) {
			if(number%i==0) return false;
		}
		return true;
	}
	
	private static boolean primeStream(int number) {
		return IntStream.range(2, number).noneMatch(index->number%index==0);		
	}
	
	public static void main(String[] args) {
		
		System.out.println(primeStream(999983));

	}
}

