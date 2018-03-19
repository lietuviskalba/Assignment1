package part1BigONotationStudy.driver;

import java.util.ArrayList;
import java.util.Random;

import part1BigONotationStudy.timers.Stopwatch;
import part1BigONotationStudy.timers.Timing;

public class TestTiming {

	public static void main(String[] args) {
		
		System.out.println("System started...");
		
		Stopwatch timer =  new Stopwatch();
		
		//initialize arguments
		int n = 33; // start off 
		int m = 44; // end off
		int arrStart = 1000;
		int arrEnd = 16000; //8192000
		
		int[] nArr = Timing.randomarr(92000); //8192000
		showArr(nArr);
		
		timer.start();
		//======================================== A
		for (int i = n; i <= m; i++) {
			System.out.println(i+ ") The Daffy method");
			Timing.daffy(n);
		}
		timer.stop();
		System.out.println(timer);
		//======================================== B
		//timerA.start(); Do I need to add other .start()
		for (int i = n; i <= m; i++) {
			System.out.println(i+ ") The Donald method");
			Timing.donald(n);
		}		
		timer.stop();
		System.out.println(timer);
		//======================================== C	
		for (int i = arrStart; i <= arrEnd; i *= 2) {
			System.out.println(i+ ") The Mickey method");
			Timing.mickey(nArr);
		}		
		timer.stop();
		System.out.println(timer);
		//======================================== D
	}	
	
	public static void showArr(int[] arr) {
		for (int i=0 ; i < arr.length; i++) {
			System.out.println(i+") the arr : " + arr[i]);
		}
	}
}
