package oldshelf;

public class TextBook extends Book {

	// `subject` should be private and final for immutability and encapsulation
	private final String subject;

	// Constructor for initializing `subject` and passing title to superclass constructor
	public TextBook(String title, String subject) {
		super(title);  // Initialize the title in superclass Book
		this.subject = subject;
	}

	// Getter for `subject` (required)
	public String getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		return "TextBook{title='" + getTitle() + "', subject='" + subject + "'}";
	}
}
