package newshelf;

import oldshelf.Comic;
import oldshelf.Fiction;
import oldshelf.FictionType;
import oldshelf.TextBook;

public class NewSelection {

	/**
	 * Returns specific information based on the type of `o`:
	 * - If `o` is not a `Book`, returns an empty string.
	 * - If `o` is a `Comic`, returns the title.
	 * - If `o` is a `Fiction`, returns the name.
	 * - If `o` is a `TextBook`, returns the subject.
	 * 
	 * @param o object
	 * @return corresponding string based on the object's type
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
		// Test cases
		Comic comic = new Comic("Superhero Adventures", 25);
		Fiction fiction = new Fiction("Mystery Novel", FictionType.Comedy);
		fiction.setName("Whodunit Series");
		TextBook textBook = new TextBook("Calculus 101", "Mathematics");

		System.out.println("Comic Title: " + getAgeOrTitle(comic));     
		System.out.println("Fiction Name: " + getAgeOrTitle(fiction));  
		System.out.println("TextBook Subject: " + getAgeOrTitle(textBook)); 
	}
}
