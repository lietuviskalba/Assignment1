package part1BigONotationStudy.driver;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

import part1BigONotationStudy.timers.Stopwatch;
import part1BigONotationStudy.timers.Timing;

public class TestTiming {

	public static void main(String[] args) {
		
		System.out.println("System 1 started...");
		
		Stopwatch timer =  new Stopwatch();
		
		//initialize arguments
		int n = 33; // start off 
		int m = 44; // end off
		int arrStart = 1000;
		int arrEnd = 8000; //8192000
		
		int[] nArr = Timing.randomarr(92000); //8192000
		
		timer.start();
		//======================================== A
		for (int i=n; i<=m; i++) {
			Timing.daffy(n);
			timer.stop();
			System.out.println("Daffy method n: " + i + " Done at: " + timer.time());
		}
		
		System.out.println("	A: Daffy method time final stop:" + timer.time());
		//======================================== B
		for (int i=n; i<=m; i++) {
			Timing.donald(n);
			timer.stop();
			System.out.println("Donald method n: " + i + " Done at: " + timer.time());
		}		
		System.out.println("	B: Donald method time final stop: " + timer.time());
		
		
		
		
		
//		//======================================== C
//		for (int i = arrStart; i <= arrEnd; i *= 2) {
//			System.out.println(i+ ")");
//			for(int j=0; j<=i; j++) {
//			Timing.mickey(nArr);
//			}
//		}		
//		timer.stop();
//		System.out.println("C: Mickey method time: " + timer.time());
//		//======================================== D
//		for (int i = arrStart; i <= arrEnd; i *= 2) {
//			System.out.println(i+ ")");
//			Timing.minnie(nArr);
//		}		
//		timer.stop();
//		System.out.println("D: Minnie method time: " + timer.time());
//		//======================================== E1
//		for (int i = arrStart; i <= arrEnd; i *= 2) {
//			System.out.println(i+ ")");
//			Timing.goofy(nArr);
//		}		
//		timer.stop();
//		System.out.println("E: Goofy method time: " + timer.time());
//		//======================================== E2
//		for (int i = arrStart; i <= arrEnd; i *= 2) {
//			System.out.println(i+ ")");
//			Timing.pluto(nArr);
//		}		
//		timer.stop();
//		System.out.println("E2: Pluto method time: " + timer.time());
//		//======================================== F
//		for (int i = arrStart; i <= arrEnd; i *= 2) {
//			System.out.println(i+ ")");
//			Timing.pluto(nArr);
//			Timing.goofy(nArr);
//		}		
//		timer.stop();
//		System.out.println("F: Gyro method time: " + timer.time());
//		//======================================== G
//		BigInteger bign = BigInteger.valueOf((long) arrStart);
//		arrEnd = 64000;
//		
//		for (int i = arrStart; i <= arrEnd; i *= 2) {
//			System.out.println(i+ ")");
//			Timing.fact(bign);
//		}		
//		timer.stop();
//		System.out.println("G: Fact method time: " + timer.time());		
	}	
}
