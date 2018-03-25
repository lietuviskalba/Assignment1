package part3Recursion.driver;

import part3Recursion.recursion.RecursionPartIII;

public class TestRecursion {

	public static void main(String[] args) {

		System.out.println("System started 3...");
		
		RecursionPartIII r = new RecursionPartIII();
		r.pattern(1, 5);
		r.level("TITLE", 2);
		r.pattern(1, 9);
		r.level("TITLE_II", 3); // don't do  more then 3
	}

}
