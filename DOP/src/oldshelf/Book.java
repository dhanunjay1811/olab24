package oldshelf;

public abstract class Book {

	// Common property for all books
	private String title;
	public Book(){}	// Constructor to initialize title
	public Book(String title) {
		this.title = title;
	}

	// Getter for title
	public String getTitle() {
		return title;
	}

	// Setter for title
	public void setTitle(String title) {
		this.title = title;
	}


	// Optional: Common toString method
	@Override
	public String toString() {
		return "Book{title='" + title + "'}";
	}
}
