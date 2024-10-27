package oldshelf;

public class OldSelection {

	/**
	 * This method checks the type of the passed object.
	 * - If `o` is not a `Book`, it returns an empty string.
	 * - If `o` is a `Comic`, it returns the title.
	 * - If `o` is a `Fiction`, it returns the name.
	 * - If `o` is a `TextBook`, it returns the subject.
	 * 
	 * @param o object
	 * @return the corresponding string based on the object's type
	 */
	public static String getAgeOrTitle(Object o) {
		if (o instanceof Comic) {
			return ((Comic) o).getTitle();
		} else if (o instanceof Fiction) {
			return ((Fiction) o).getName();
		} else if (o instanceof TextBook) {
			return ((TextBook) o).getSubject();
		}
		return "";
	}

	public static void main(String[] args) {
		// Test code
		Comic comic = new Comic("Superhero Adventures", 25);
		Fiction fiction = new Fiction("Mystery Novel", FictionType.Comedy);
		fiction.setName("Whodunit Series");
		TextBook textBook = new TextBook("Calculus 101", "Mathematics");

		System.out.println("Comic Title: " + getAgeOrTitle(comic));
		System.out.println("Fiction Name: " + getAgeOrTitle(fiction));    
		System.out.println("TextBook Subject: " + getAgeOrTitle(textBook)); 
	}
}
