/****************************************************************************************************
*Project:            <COMP2080_ASSIGN1_NULL_AND_VOID>
*Assignment:         <assignment 1>
*Author(s):          <Ryan Hirmiz>
*Student Number:     <101086605>
*Date:				 2018 - 03 - 29
*Description:        <A driver designed to test the RecursionPartIII class.>
****************************************************************************************************/
package part3Recursion.driver;

import part3Recursion.recursion.RecursionPartIII;

public class TestRecursion {

	public static void main(String[] args) {
		
		RecursionPartIII r = new RecursionPartIII();
		
		// Digits in the "title" recursive method are only allowed to be between 1 - 9 as stipulated in the assignment.
		// No values 10 or higher. No values of 0 or lower.
		
		r.pattern(1, 5);
		r.level("TITLE_", 2); // Underscores added for visibility.
		r.pattern(1, 9);
		r.level("SECOND_TITLE_", 3); // Underscores added for visibility.
		r.pattern(1, 4);
		// r.level("TITLE_III", 4); 
		// r.level("TITLE_III", 6);

	}

}
