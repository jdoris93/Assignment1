public class Test extends MiniGenBankSeq {

	public static void main(String[] args) {
		MiniGenBankSeq test= new MiniGenBankSeq();
			long nanoseconds = test.testConcatenate(10);
			double seconds = nanoseconds / (double)1000000000; 
			System.out.println("concatenating took " + seconds + " seconds");

		}
	
		
		
	}

