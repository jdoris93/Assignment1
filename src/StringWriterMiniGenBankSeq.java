import java.io.StringWriter;

public class StringWriterMiniGenBankSeq extends MiniGenBankSeq {

	@Override
	public void concatenate(String s, int times) {
		StringWriter seq = new StringWriter();

		for (int i = 0; i < times; i++) {
			System.out.println("concatenating  " + i + " out of" + times);
			seq.append(s);

		}
		sequence = seq.toString();
	}
}
