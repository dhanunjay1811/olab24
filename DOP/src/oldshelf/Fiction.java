package oldshelf;

public class Fiction extends Book {

	// The strictest modifier (private) for `name`
	private String name;
	
	/**
	 * `type` is now an instance-level final field, initialized only once per instance.
	 */
	private final FictionType type;
	
	// Constructor with title parameter, initializes `type` only once for each instance
	public Fiction(String title, FictionType type) {
		super();
		this.type = type; // Initializes `type` only once per instance
	}
	
	// Getter for `type` (if required)
	public FictionType getType() {
		return type;
	}

	// Setter for `name` (if required)
	public void setName(String name) {
		this.name = name;
	}

	// Getter for `name`
	public String getName() {
		return name;
	}
	// Override toString for readable output
	@Override
	public String toString() {
		return "Fiction{name='" + name + "', type=" + type + ", title='" + this.getTitle() + "'}";
	}
}
