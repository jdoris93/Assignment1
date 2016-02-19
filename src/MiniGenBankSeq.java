
public class MiniGenBankSeq extends SequenceLoader {
	// Data members
	private String locus;
	private String accNum;
	private String definition;
	private String source;

	// Methods (getters/setters)
	public String getLocus() {
		return stringNotInit(locus);
	}

	public String getAccNum() {
		return stringNotInit (accNum);
	}

	public String getDefinition() {
		return stringNotInit (definition);
	}

	public String getSource() {
		return stringNotInit (source);
	}

	public void setLocus(String _locus) {
		locus = _locus;
	}

	public void setAccNum(String _accNum) {
		accNum = _accNum;
	}

	public void definition(String _definition) {
		definition = _definition;
	}

	public void source(String _source) {
		source = _source;
	}

	// Constructors
	MiniGenBankSeq() {
	}; // Uninitialized constructor

	MiniGenBankSeq(String constructLocus, String constructAccNum) { // semi-initialized
		locus = constructLocus;
		accNum = constructAccNum;
	}

	// fully initialized constructor
	MiniGenBankSeq(String constructLocus, String constructAccNum, String constructDefinition, String constructSource) {
		locus = constructLocus;
		accNum = constructAccNum;
		definition = constructDefinition;
		source = constructSource;
	}

	// overriding toString from Object

	//letting method handle extra cases; using get___ because retrieving it indirectly
	@Override
	public String toString() {
		return "locus: " + getLocus() + "\n" + "accNum: " + getAccNum() + "\n" + "definition: " + getDefinition() + "\n" + "source: "
				+ getSource() + "\n";
	}

	public String stringNotInit(String inputString) {
		if (inputString == null) {
			
			return "This data member is not initialized";
		}
		else {
			return inputString;
		}
		
	}

}
