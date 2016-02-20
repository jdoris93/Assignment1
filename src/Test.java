/*
 * AUTHOR: Doris Jin
 * COURSE: BIF812	
 * INSTRUCTOR: Marek Laskowski
 * PURPOSE: The purpose of this Test.java file is as a class that is part of assignment1. It hosts the main
 * method to test the "normal" concatenation method.
 * 
 * I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

public class Test extends MiniGenBankSeq {

	public static void main(String[] args) {
		/**create a new object of MiniGenBankSwq, will utilize methods from SequenceLoader to concatenate and calculate the
		time taken
		**/
		
		MiniGenBankSeq test = new MiniGenBankSeq();
		long nanoseconds = test.testConcatenate(10);
		double seconds = nanoseconds / (double) 1000000000;
		System.out.println("Concatenating took " + seconds + " seconds");
	}
}
