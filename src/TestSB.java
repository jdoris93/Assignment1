
public class TestSB extends StringBuilderMiniGenBankSeq{

	public static void main(String[] args) {
		StringBuilderMiniGenBankSeq testSB = new StringBuilderMiniGenBankSeq();
		
			long nanoseconds = testSB.testConcatenate(10);
			double seconds = nanoseconds / (double)1000000000; 
			System.out.println("concatenating using StringBuilder took " + seconds + " seconds");

		}

	}

