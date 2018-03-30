/****************************************************************************************************
*Project:            <COMP2080_ASSIGN1_NULL_AND_VOID>
*Assignment:         <assignment 1>
*Author(s):          <Ryan Hirmiz>
*Student Number:     <101086605>
*Date:				 2018 - 03 - 29
*Description:        <Driver that tests the Big O of provided methods>
****************************************************************************************************/

package part1BigONotationStudy.driver;

import part1BigONotationStudy.method_tester.MethodTest;

public class TestTiming {

	public static void main(String[] args) {
		
		System.out.println("System 1 started... \n");
		
		MethodTest mt = new MethodTest();
		
		boolean showTask = false; // Change this to show methods in console

		mt.testDaffy_A(showTask);
		mt.testDonald_B(showTask);
		mt.testMickey_C(showTask);
		mt.testMinnie_D(showTask);
		mt.testGoofy_E1(showTask);
		mt.testPluto_E2(showTask);
		mt.testPlutoAndGoofy_F(showTask);
		mt.testFact_G(showTask);
	}	
}
