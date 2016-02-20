/*I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

public class TestSW extends StringWriterMiniGenBankSeq {
	/**create a new object of StringWriter, will utilize String writer to concatenate. The time taken will
	 * be calculated as done so in SequenceLoader
	**/
	public static void main(String[] args) {
		StringWriterMiniGenBankSeq testSW = new StringWriterMiniGenBankSeq();

		long nanoseconds = testSW.testConcatenate(100);
		double seconds = nanoseconds / (double) 1000000000;
		System.out.println("concatenating using StringWriter took " + seconds + " seconds");

	}
}
