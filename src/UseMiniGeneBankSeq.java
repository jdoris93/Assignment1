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

/*Real data was used as input from the following links:
 * http://www.ncbi.nlm.nih.gov/Sitemap/samplerecord.html
 * http://www.genome.jp/dbget-bin/www_bget?refseq+NC_000913
 */


public class UseMiniGeneBankSeq {

	public static void main(String[] args) { //create and instantiate objects in the main here, then print to view
		MiniGenBankSeq bankSeq1= new MiniGenBankSeq(); //creating object with no argument constructor
		System.out.println(bankSeq1.toString()); //print to view

		//setting data for all variables, initialize
		MiniGenBankSeq bankSeq2= new MiniGenBankSeq();
		bankSeq2.setLocus("SCU49845     5028 bp    DNA             PLN       21-JUN-1999"); 	
		bankSeq2.setAccNum("U49845");
		bankSeq2.definition("Saccharomyces cerevisiae TCP1-beta gene, partial cds, and Axl2p (AXL2) and Rev7p (REV7) genes, complete cds.");
		bankSeq2.source("Saccharomyces cerevisiae (baker's yeast)");
		System.out.println(bankSeq2.toString()); //print to visualize set data	

		//creating object with 2 args constructor, then setting two of the objects and initialize
		MiniGenBankSeq bankSeq3= new MiniGenBankSeq("NC_000913            4641652 bp    DNA     circular CON 16-DEC-2014", "NC_000913" ); //using 2 args constructor to initiate two data members, two are initialized by the 2 args setter
		System.out.println(bankSeq3.toString()); ///
		
		bankSeq3.definition("Escherichia coli str. K-12 substr. MG1655, complete genome.");
		bankSeq3.source(" Escherichia coli str. K-12 substr. MG1655");	
		System.out.println(bankSeq3.toString());
		
		//creating object with 4 args constructor, don't need to set
		MiniGenBankSeq bankSeq4= new MiniGenBankSeq("NC_002549              18959 bp    cRNA    linear   VRL 30-MAR-2015", "NC_002549","Zaire ebolavirus isolate Ebola virus/H.sapiens-tc/COD/1976/Yambuku-Mayinga, complete genome. ", "Zaire ebolavirus" );
		System.out.println(bankSeq4.toString());
	} 

}
