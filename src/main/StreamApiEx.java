package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx {
	public static void main(String[] args) throws Exception {
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);
		
		Stream<Integer> sequentialStream = myList.stream();
		Optional<Integer> myList2 = myList.stream().filter(p -> p > 90).sorted().reduce((i,j)->i+j);
		if(myList2.isPresent())
			System.out.println(myList2.get());
	}

}
