/*
 * AUTHOR: Doris Jin
 * COURSE: BIF812	
 * INSTRUCTOR: Marek Laskowski
 * PURPOSE: The purpose of this TestSB.java file is as a class that is part of assignment1.
 * 
 * I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

public class TestSB extends StringBuilderMiniGenBankSeq{
	/**create a new object of StringBuilder, will utilize String builder to concatenate. The time taken will
	 * be calculated as done so in SequenceLoader
	**/
	public static void main(String[] args) {
		StringBuilderMiniGenBankSeq testSB = new StringBuilderMiniGenBankSeq();
		
			long nanoseconds = testSB.testConcatenate(10);
			double seconds = nanoseconds / (double)1000000000; 
			System.out.println("concatenating using StringBuilder took " + seconds + " seconds");

		}

	}

