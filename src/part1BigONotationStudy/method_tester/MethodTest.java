/****************************************************************************************************
*Project:            <COMP2080_ASSIGN1_NULL_AND_VOID>
*Assignment:         <assignment 1>
*Author(s):          <Mantas Lingaitis>
*Student Number:     <101165443>
*Date:				 2018 - 03 - 29
*Description:        <Test the provided methods with loops and time them>
****************************************************************************************************/

package part1BigONotationStudy.method_tester;

import java.math.BigInteger;

import part1BigONotationStudy.timers.Stopwatch;
import part1BigONotationStudy.timers.Timing;

public class MethodTest {

	Stopwatch timer =  new Stopwatch();
	
	//initialize arguments
	int nAB = 33; 	// start off 
	int mAB = 44; 	// end off
	int nArrC = 1000;
	int mArrC = 8192000; //8192000
	int nArrDEF = 1000;
	int mArrDEF = 256000; //256000
	int nBigIntG = 1000;
	int mBigIntG = 64000; //64000
	
	double currTime = 0;
	double prevTime = 0;
		
	int[] nArr = {};
	
	public void testDaffy_A(boolean isShow) {
		timer.start();
		//======================================== A
		for (int i=nAB; i<=mAB; i++) {			
			Timing.daffy(i);
			timer.stop();
			System.out.println(timer.time()); // 44
		}
		if(isShow)
		System.out.println("\n	A: Daffy method time final stop:" + timer.time());
	}
	
	public void testDonald_B(boolean isShow) {		
		//======================================== B		Check the currTime if you want
		prevTime = currTime;				
		for (int i=nAB; i<=mAB; i++) {		
			Timing.donald(i);
			timer.stop();
			currTime = timer.time();
			//System.out.println("curr time: " + currTime + "  - prev Time: " + prevTime + " = " + ((currTime - prevTime) / 1000000000.0));
			currTime = currTime - prevTime ;
			//System.out.println(i + " " + currTime);
			System.out.println(timer.time());
		}	
		if(isShow)
		System.out.println("\n	B: Donald method time final stop: " + timer.time());
	}
	
	public void testMickey_C(boolean isShow) {
		populate(mArrC);
		//======================================== C
		for (int i = nArrC; i <= mArrC; i *= 2) {			
			Timing.mickey(nArr);	
			timer.stop();
			System.out.println(timer.time()); // 8192000
		}
		if(isShow)
		System.out.println("	C: Mickey method time: " + timer.time());
	}
	
	public void testMinnie_D(boolean isShow) {
		populate(mArrDEF);
		//======================================== D
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {
			Timing.minnie(nArr);		
			timer.stop();
			System.out.println(timer.time());//256000
		}
		if(isShow)
		System.out.println("	D: Minnie method time: " + timer.time());
	}
	
	public void testGoofy_E1(boolean isShow) {
		populate(mArrDEF);
		//======================================== E1
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {			
			Timing.goofy(nArr);		
			timer.stop();
			System.out.println(timer.time());
		}	
		if(isShow)
		System.out.println("	E1: Goofy method time: " + timer.time());
	}
	
	public void testPluto_E2(boolean isShow) {
		populate(mArrDEF);
		//======================================== E2
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {
			Timing.pluto(nArr);			
			timer.stop();
			System.out.println(timer.time());
		}	
		if(isShow)
		System.out.println("	E2: Pluto method time: " + timer.time());
	}
	
	public void testPlutoAndGoofy_F(boolean isShow) {
		populate(mArrDEF);
		//======================================== F
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {
				Timing.pluto(nArr);
				Timing.gyro(nArr);
			timer.stop();
			System.out.println(timer.time());
		}
		if(isShow)
		System.out.println("	F: Gyro method time: " + timer.time());
	}
	
	public void testFact_G(boolean isShow) {
		//======================================== G
		BigInteger bign = BigInteger.valueOf((long) nBigIntG);
		
		for (int i = nBigIntG; i <= mBigIntG; i *= 2) {
			for(int j=0; j<=i; j++) {
				Timing.fact(bign);
			}
			timer.stop();
			System.out.println(timer.time()); 
		}	
		if(isShow)
		System.out.println("	G: Fact method time: " + timer.time());	
	}
	public void populate(int rangeN) {
		//Populate the values of the array with n
		nArr = Timing.randomarr(rangeN);
	}
}

