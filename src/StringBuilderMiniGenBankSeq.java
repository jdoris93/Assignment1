/*
 * AUTHOR: Doris Jin
 * COURSE: BIF812	
 * INSTRUCTOR: Marek Laskowski
 * PURPOSE: The purpose of this StringBuilder.java file is as a class that is part of assignment1. It hosts the 
 * StringBuilder class.
 * 
 * I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

public class StringBuilderMiniGenBankSeq extends MiniGenBankSeq {
	//implement the StringBuilder class over the normal concatenation method
	
	
	@Override
	public void concatenate(String s, int times) {
		StringBuilder seq = new StringBuilder();
		
		for (int i = 0; i < times; i++) {
				System.out.println("concatenating " + i + " out of " + times);
				seq.append(s);	
		}
		sequence = seq.toString();
	}

}
