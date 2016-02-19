/*I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Doris Jin 031254154 */

import java.io.StringWriter;

public class StringWriterMiniGenBankSeq extends MiniGenBankSeq {

	@Override
	public void concatenate(String s, int times) {
		StringWriter seq = new StringWriter();

		for (int i = 0; i < times; i++) {
			System.out.println("concatenating  " + i + " out of " + times);
			seq.append(s);

		}
		sequence = seq.toString();
	}
}
