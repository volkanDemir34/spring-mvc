package main;

public class SupressedException {
	public static void main(String[] args) {
		try (Wolf obj = new Wolf(); Deer obj1 = new Deer();) {
			// Both close statements are executed .
			// Therefore , we see two closing stmts
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Wolf implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closing Wolf !");
		throw new RuntimeException("In Wolf !");
	}
}

class Deer implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closing Deer !");
		throw new RuntimeException("In Deer !");
	}
}