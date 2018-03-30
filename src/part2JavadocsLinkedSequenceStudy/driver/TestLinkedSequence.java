/****************************************************************************************************
*Project:            <COMP2080_ASSIGN1_NULL_AND_VOID>
*Assignment:         <assignment 1>
*Author(s):          <Ryan Hirmiz>
*Student Number:     <101086605>
*Date:				 2018 - 03 - 29
*Description:        <driver to test the linked sequence method>

****************************************************************************************************/

package part2JavadocsLinkedSequenceStudy.driver;

import part2JavadocsLinkedSequenceStudy.OurLinkedList.ILinkedSequence;
import part2JavadocsLinkedSequenceStudy.OurLinkedList.LinkedSequence;

public class TestLinkedSequence {

	public static void main(String[] args) {
		System.out.println("System started 2...");
		
		// The test driver will be testing with String
		ILinkedSequence<String> sq1 = new LinkedSequence<String>();
		ILinkedSequence<String> sq2 = new LinkedSequence<String>();
		//add some element to sq1
		sq1.addAfter("A");
		sq1.addAfter("B");
		sq1.addAfter("C");
		sq1.addBefore("D");
		sq1.addBefore("Z");
		sq1.addBefore("F");
		//add some element to sq2
		sq2.addAfter("AA");
		sq2.addAfter("AB");
		sq2.addBefore("BC");
		sq2.addAfter("CD");
		sq2.addBefore("EE");
		//Test one, print out all elements from both sequence
		System.out.println("STARTING THE FIRST TEST...");
		System.out.println("Sequence one:");
		sq1.printSequence();
		System.out.println("Sequence two:");
		sq2.printSequence();
		System.out.println("****************************************************");
		
		//Test two, point the current element to another element in the sequence
		//advance current element from sequence one to 2 elements
		System.out.println("STARTING THE SECOND TEST...");
		sq1.advance();
		sq1.advance();
		sq2.advance();
		System.out.println("Sequence one:");
		sq1.printSequence();
		System.out.println("Sequence two:");
		sq2.printSequence();
		System.out.println("****************************************************");
		
		//Test three
		//remove one current element from both sequence
		System.out.println("STARTING THE THIRD TEST...");
		sq1.removeCurrent();
		sq2.removeCurrent();
		System.out.println("Sequence one:");
		sq1.printSequence();
		System.out.println("Sequence two:");
		sq2.printSequence();
		System.out.println("****************************************************");
		//Test four
		//add sequence two to sequence one
		System.out.println("STARTING THE FOURTH TEST...");
		sq1.addAll(sq2);
		System.out.println("Sequence one:");
		sq1.printSequence();
		System.out.println("Sequence two:");
		sq2.printSequence();
		System.out.println("****************************************************");
		//Test five
		//create a clone of sequence one
		System.out.println("STARTING THE FIFTH TEST...");
		ILinkedSequence<String> sq3 = sq1.clone();
		System.out.println("Sequence three:");
		sq3.printSequence();
		System.out.println("****************************************************");
		//Test six
		//concatenate 2 sequences into 1 sequence sq4 = sq1 + sq3
		System.out.println("STARTING THE SIXTH TEST...");
		ILinkedSequence<String> sq4 = LinkedSequence.concatenaton(sq1, sq3);
		System.out.println("Sequence four:");
		sq4.printSequence();
		System.out.println("****************************************************");

	}

}
