package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

interface MyInterface1 {
	public static int num = 100;

	public default void display() {
		System.out.println("display method of MyInterface1");
		print("ss");
	}

	public default void display2() {
		System.out.println("display method of MyInterface1");
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

}

interface MyInterface2 {
	public static int num = 1000;

	public default void display() {
		System.out.println("display method of MyInterface2");
	}

}

public class InterfaceExample implements MyInterface1, MyInterface2 {
	
	public static int sort(int i,int j) {
		return j-i;
	}

	public static void main(String args[]) {
		InterfaceExample obj = new InterfaceExample();
		Comparator<Integer> comp = InterfaceExample::sort;
		// obj.display();
		Thread thread = new Thread(() -> System.out.println("My Runnable"));
		thread.start();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.sort(comp);
		System.out.println(list.get(0));

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		MyInterface1.super.display();
		MyInterface1.print("ss");
	}
}
