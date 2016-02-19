
public class StringBuilderMiniGenBankSeq extends MiniGenBankSeq {
	
	@Override
	public void concatenate(String s, int times) {
		StringBuilder seq = new StringBuilder();
		
		for (int i = 0; i < times; i++) {
				System.out.println("concatenating " + i + " out of " + times);
				seq.append(s);
			
		}
		sequence = seq.toString();
	}

}
