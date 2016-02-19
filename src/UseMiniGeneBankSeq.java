/*
 * AUTHOR: Doris Jin
 * COURSE: BIF812	
 * INSTRUCTOR: Marek Laskowski
 * PURPOSE: The purpose of this UseMiniGenBankSeq.java file is as a class that is part of assignment1.
 * 
 * I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

/*Except, real GenBank data was used as input data from the links:
 * http://www.ncbi.nlm.nih.gov/Sitemap/samplerecord.html
 */


public class UseMiniGeneBankSeq {

	public static void main(String[] args) { //instantiate objects in the main here
		MiniGenBankSeq bankSeq1= new MiniGenBankSeq(); //create a new object of MiniGenBankSeq
		System.out.println(bankSeq1.toString()); //print object with no argument constructor

		//use MiniGenBankSeq setter method to
		MiniGenBankSeq bankSeq2= new MiniGenBankSeq();
		bankSeq2.setLocus("SCU49845     5028 bp    DNA             PLN       21-JUN-1999"); 	//provide data for the object for all variables as not set by constructor
		bankSeq2.setAccNum("U49845");
		bankSeq2.definition("Saccharomyces cerevisiae TCP1-beta gene, partial cds, and Axl2p (AXL2) and Rev7p (REV7) genes, complete cds.");
		bankSeq2.source("Saccharomyces cerevisiae (baker's yeast)");
		System.out.println(bankSeq2.toString()); //print object for all variables not set by constructor		

		MiniGenBankSeq bankSeq3= new MiniGenBankSeq("SCU49845", "U49845" );
		System.out.println(bankSeq3.toString()); ///
		bankSeq3.definition("Saccharomyces cerevisiae TCP1-beta gene, partial cds, and Axl2p (AXL2) and Rev7p (REV7) genes, complete cds.");
		bankSeq3.source("Saccharomyces cerevisiae (baker's yeast)");	
		System.out.println(bankSeq3.toString()); //print objects using 2 args constructor with second Genbank file
		
		
		MiniGenBankSeq bankSeq4= new MiniGenBankSeq("SCU49845", "U49845","Saccharomyces cerevisiae TCP1-beta gene, partial cds, and Axl2p (AXL2) and Rev7p (REV7) genes, complete cds.", "Saccharomyces cerevisiae (baker's yeast)" );
		System.out.println(bankSeq4.toString());
	}

}
