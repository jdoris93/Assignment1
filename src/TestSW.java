
public class TestSW extends StringWriterMiniGenBankSeq {

	public static void main(String[] args) {
		StringWriterMiniGenBankSeq testSB = new StringWriterMiniGenBankSeq();

		long nanoseconds = testSB.testConcatenate(10);
		double seconds = nanoseconds / (double) 1000000000;
		System.out.println("concatenating using StringWriter took " + seconds + " seconds");

	}
}
