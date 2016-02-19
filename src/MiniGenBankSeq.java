/*
 * AUTHOR: Doris Jin
 * COURSE: BIF812	
 * INSTRUCTOR: Marek Laskowski
 * PURPOSE: The purpose of this MiniGenBankSeq.java file is as a class that is part of assignment1.
 * 
 * I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

public class MiniGenBankSeq extends SequenceLoader {
	// Data members
	private String locus;
	private String accNum;
	private String definition;
	private String source;

	// Declare methods (getters/setters); if method is null, returns stringNotInit error message
	//otherwise, returns value of appropriate variable
	public String getLocus() {
		return stringNotInit(locus);
	}

	public String getAccNum() {
		return stringNotInit (accNum);
	}

	public String getDefinition() {
		return stringNotInit (definition);
	}

	public String getSource() {
		return stringNotInit (source);
	}

	public void setLocus(String _locus) {
		locus = _locus;
	}

	public void setAccNum(String _accNum) {
		accNum = _accNum;
	}

	public void definition(String _definition) {
		definition = _definition;
	}

	public void source(String _source) {
		source = _source;
	}

	// Declare Constructors
	// Uninitialized constructor (no arguments)
	MiniGenBankSeq() {
	}; 

	// semi-initialized (2 arguments)
	MiniGenBankSeq(String constructLocus, String constructAccNum) { 
		locus = constructLocus;
		accNum = constructAccNum;
	}

	// fully initialized constructor (4 arguments)
	MiniGenBankSeq(String constructLocus, String constructAccNum, String constructDefinition, String constructSource) {
		locus = constructLocus;
		accNum = constructAccNum;
		definition = constructDefinition;
		source = constructSource;
	}

	// overriding toString from Object
	@Override
	public String toString() {
		return "locus: " + getLocus() + "\n" + "accNum: " + getAccNum() + "\n" + "definition: " + getDefinition() + "\n" + "source: "
				+ getSource() + "\n";
	}

	//error message code; if null is found, returns error message, otherwise will return the string's input
	public String stringNotInit(String inputString) {
		if (inputString == null) {
			return "This data member is not initialized";
		}
		else {
			return inputString;
		}
	}
}
