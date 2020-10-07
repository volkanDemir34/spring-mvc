package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.mvc.model.Foo;



public class FooEx {

	public static void main(String[] args) {

		List<Foo> fooList = new ArrayList<>();

		fooList.add(new Foo(1, "P1", 300, 400));
		fooList.add(new Foo(2, "P2", 600, 400));
		fooList.add(new Foo(3, "P3", 30, 20));
		fooList.add(new Foo(3, "P3", 70, 20));
		fooList.add(new Foo(1, "P1", 360, 40));
		fooList.add(new Foo(4, "P4", 320, 200));
		fooList.add(new Foo(4, "P4", 500, 900));

		/*
		 * fooList.stream().collect(Collectors.groupingBy(Foo::getId)).entrySet().stream
		 * ().map(e -> e.getValue().stream() .reduce((a, b) -> new Foo(a.getId(),
		 * a.getName(), a.getTargetCost(),
		 * a.getActualCost()))).map(Optional::get)).collect;
		 */

		Stream<Entry<Integer, List<Foo>>> streamFoo = fooList.stream().collect(Collectors.groupingBy(Foo::getId))
				.entrySet().stream();
		List<Foo> foo = streamFoo
				.map(e -> e.getValue().stream()
						.reduce((a, b) -> new Foo(a.getId(), a.getName(), a.getTargetCost().add(b.getTargetCost()),
								a.getActualCost().add(b.getActualCost()))))
				.map(Optional::get).collect(Collectors.toList());
		foo.stream().forEach(e -> System.out
				.println(e.getId() + "--" + e.getName() + "--" + e.getTargetCost() + "--" + e.getActualCost()));
		
	
		
		System.out.println("Yeniden dene");

		Map<Integer, List<Foo>> fooMap = new HashMap<>();
		for (Foo foo2 : fooList) {
			if (!fooMap.containsKey(foo2.getId()))
				fooMap.put(foo2.getId(), new ArrayList<Foo>());

			fooMap.get(foo2.getId()).add(foo2);

		}
		
		/*Before Java 8*/
			
		Iterator<List<Foo>>	 iterator = fooMap.values().iterator();
		List<Foo> newFooList = new ArrayList<>();
		while(iterator.hasNext()) {
			BigDecimal sumTargetCost = BigDecimal.ZERO;
			BigDecimal sumActualCost = BigDecimal.ZERO;
			int id=0;
			String name=null;
			for(Foo fooInList : iterator.next()) {
				id=fooInList.getId();
				name=fooInList.getName();
				sumTargetCost = sumTargetCost.add(fooInList.getTargetCost());
				sumActualCost = sumActualCost.add(fooInList.getActualCost());
			}
			newFooList.add(new Foo(id,name,sumTargetCost,sumActualCost));
		}
	
		
		newFooList.stream().forEach(e -> System.out
				.println(e.getId() + "--" + e.getName() + "--" + e.getTargetCost() + "--" + e.getActualCost()));

				

	}
}
