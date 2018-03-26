package part1BigONotationStudy.driver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

import part1BigONotationStudy.method_tester.MethodTest;
import part1BigONotationStudy.timers.Stopwatch;
import part1BigONotationStudy.timers.Timing;

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

//insert into main

/* 		Stopwatch timer =  new Stopwatch();
		
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
		
		int[] nArr = Timing.randomarr(64000); //8192000
		
		timer.start();
		//======================================== A
		for (int i=nAB; i<=mAB; i++) {			
			Timing.daffy(nAB);
			timer.stop();
			currTime = timer.time();
			System.out.println(currTime); // 44
		}
		
		System.out.println("\n	A: Daffy method time final stop:" + timer.time());
		//======================================== B
		prevTime = currTime;
		
		for (int i=nAB; i<=mAB; i++) {		
			Timing.donald(nAB);
			timer.stop();
			currTime = timer.time();
			//System.out.println("curr time: " + currTime + "  - prev Time: " + prevTime + " = " + ((currTime - prevTime) / 1000000000.0));
			currTime = currTime - prevTime ;
			//System.out.println(i + " " + currTime);
			System.out.println(timer.time());
		}		
		System.out.println("\n	B: Donald method time final stop: " + timer.time());
		//======================================== C
		for (int i = nArrC; i <= mArrC; i *= 2) {			
			Timing.mickey(nArr);	
			timer.stop();
			System.out.println(timer.time()); // 8192000
		}		
		System.out.println("	C: Mickey method time: " + timer.time());
		//======================================== D
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {
			Timing.minnie(nArr);		
			timer.stop();
			System.out.println(timer.time());//256000
		}		
		System.out.println("	D: Minnie method time: " + timer.time());
		//======================================== E1
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {			
				Timing.goofy(nArr);		
			timer.stop();
			System.out.println(timer.time());
		}		
		System.out.println("	E1: Goofy method time: " + timer.time());
		//======================================== E2
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {
				Timing.pluto(nArr);			
			timer.stop();
			System.out.println(timer.time());
		}		
		System.out.println("	E2: Pluto method time: " + timer.time());
		//======================================== F
		for (int i = nArrDEF; i <= mArrDEF; i *= 2) {
				Timing.pluto(nArr);
				Timing.goofy(nArr);
			timer.stop();
			System.out.println(timer.time());
		}		
		System.out.println("	F: Gyro method time: " + timer.time());
		//======================================== G
		BigInteger bign = BigInteger.valueOf((long) nBigIntG);
		
		for (int i = nBigIntG; i <= mBigIntG; i *= 2) {
			for(int j=0; j<=i; j++) {
				Timing.fact(bign);
			}
			timer.stop();
			System.out.println(timer.time()); //64000
		}		
		System.out.println("	G: Fact method time: " + timer.time());

*/
