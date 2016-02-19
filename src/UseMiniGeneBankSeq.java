//NOTE: input data is real data taken from genbank

public class UseMiniGeneBankSeq {

	public static void main(String[] args) { //instantiate objects in the main here
		MiniGenBankSeq bankSeq1= new MiniGenBankSeq(); //adding a new something
		System.out.println(bankSeq1.toString()); //print object with no argument constructor

////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		MiniGenBankSeq bankSeq2= new MiniGenBankSeq();
		bankSeq2.setLocus("SCU49845     5028 bp    DNA             PLN       21-JUN-1999"); 	//provide data for the object for all variables as not set by constructor
		bankSeq2.setAccNum("U49845");
		bankSeq2.definition("Saccharomyces cerevisiae TCP1-beta gene, partial cds, and Axl2p (AXL2) and Rev7p (REV7) genes, complete cds.");
		bankSeq2.source("Saccharomyces cerevisiae (baker's yeast)");
		System.out.println(bankSeq2.toString()); //print object for all variables not set by constructor
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////

		MiniGenBankSeq bankSeq3= new MiniGenBankSeq();
		bankSeq3.definition("Saccharomyces cerevisiae TCP1-beta gene, partial cds, and Axl2p (AXL2) and Rev7p (REV7) genes, complete cds.");
		bankSeq3.source("Saccharomyces cerevisiae (baker's yeast)");	
		System.out.println(bankSeq3.toString()); //print objects using 2 args constructor with second Genbank file
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////

		MiniGenBankSeq bankSeq4= new MiniGenBankSeq();
		System.out.println(bankSeq4.toString());
	}

}
