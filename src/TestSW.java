/*I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

public class TestSW extends StringWriterMiniGenBankSeq {

	public static void main(String[] args) {
		StringWriterMiniGenBankSeq testSB = new StringWriterMiniGenBankSeq();

		long nanoseconds = testSB.testConcatenate(100);
		double seconds = nanoseconds / (double) 1000000000;
		System.out.println("concatenating using StringWriter took " + seconds + " seconds");

	}
}
