package part2JavadocsLinkedSequenceStudy.driver;

import part2JavadocsLinkedSequenceStudy.OurLinkedList.LinkedSequence;

public class TestLinkedSequence {

	public static void main(String[] args) {
		System.out.println("System started 2...");
		
		LinkedSequence<String> lsq = new LinkedSequence<String>();
		lsq.addAfter("MyString");
		lsq.addAfter("MyString2");
		lsq.addAfter("MyString3");
		lsq.addAfter("MyString4");
		lsq.addAfter("MyString5");
		
		LinkedSequence<String> lsq2 = new LinkedSequence<String>();
		lsq2.addAfter("Aloha");
		lsq2.addAfter("Combo");
		lsq2.addAfter("noob");
		lsq.addBefore("Morgan");
		
		lsq.addAll(lsq2);
		lsq.backward();
		lsq.advance();
		
		
		lsq.printCurrentSequence();

	}

}
