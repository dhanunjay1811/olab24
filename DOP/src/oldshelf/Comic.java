package oldshelf;
public class Comic extends Book {

	// Applying the strictest modifier, `private`, to Title
	private String title;

	// Keeping `ageOfMainCharacter` private and final to prevent modification after initialization
	private final int ageOfMainCharacter;

	// Default constructor initializing with default values
	public Comic() {
		this.title = ""; // Default title if not provided
		this.ageOfMainCharacter = 0; //Default age if not provided
	}

	// Overloaded constructor to initialize title and ageOfMainCharacter
	public Comic(String title, int ageOfMainCharacter) {
		this.title = title;
		this.ageOfMainCharacter = ageOfMainCharacter;
	}

	// Getter for title, added as required
	public String getTitle() {
		return title;
	}

	// Setter for title, added as required
	public void setTitle(String title) {
		this.title = title;
	}

	// Optional getter for ageOfMainCharacter, can be omitted if unnecessary
	public int getAgeOfMainCharacter() {
		return ageOfMainCharacter;
	}

	// Override toString method to return a meaningful representation of Comic object
	@Override
	public String toString() {
		return "Comic{title='" + title + "', ageOfMainCharacter=" + ageOfMainCharacter + "}";
	}

	// Override hashCode based on title and ageOfMainCharacter
	@Override
	public int hashCode() {
		int result = (title != null ? title.hashCode() : 0);
		result = 31 * result + ageOfMainCharacter;
		return result;
	}

	// Override equals to match based on title and ageOfMainCharacter
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Comic comic = (Comic) o;
		return ageOfMainCharacter == comic.ageOfMainCharacter &&
		       (title != null ? title.equals(comic.title) : comic.title == null);
	}
}
