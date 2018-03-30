/****************************************************************************************************
*Project:            <COMP2080_ASSIGN1_NULL_AND_VOID>
*Assignment:         <assignment 1>
*Author(s):          <Mantas Lingaitis>
*Student Number:     <101165443>
*Date:				 2018 - 03 - 29
*Description:        <A provided class to time methods>
****************************************************************************************************/


package part1BigONotationStudy.timers;


/*
 A class to measure time elapsed.
*/

public class Stopwatch
{
    private long startTime;
    private long stopTime;

    public static final double NANOS_PER_SEC = 1000000000.0;

	/**
	 start the stop watch.
	*/
	public void start()
	{	System.gc();
		startTime = System.nanoTime();
	}

	/**
	 stop the stop watch.
	*/
	public void stop()
	{	
		stopTime = System.nanoTime();	
	}

	/**
	elapsed time in seconds.
	@return the time recorded on the stop watch in seconds
	*/
	public double time()
	{	return (stopTime - startTime) / NANOS_PER_SEC;	}

	public String toString()
	{   return "elapsed time: " + time() + " seconds.";
	}

	/**
	elapsed time in nanoseconds.
	@return the time recorded on the stopwatch in nanoseconds
	*/
	public long timeInNanoseconds()
	{	return (stopTime - startTime);	}
}

