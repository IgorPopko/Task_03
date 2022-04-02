package by.it_academy.popko.test_drive;

import by.it_academy.popko.training.Book;

public class BookTestDrive {

	public static void main(String[] args) {

		Book[] theBook = new Book[10];

		theBook[0] = new Book(101, "Eugene Onegin", "Pushkin", "Ecsmo", 1956, "hard", 30, 250);
		theBook[1] = new Book(192, "Demon", "Lermontov", "Ecsmo", 1934, "hard", 15, 130);
		theBook[2] = new Book(183, "Childhood", "Tolstoy", "Lema", 1980, "soft", 77, 300);
		theBook[3] = new Book(174, "Boyhood", "Tolstoy", "Lema", 1984, "soft", 64, 260);
		theBook[4] = new Book(165, "Youth", "Tolstoy", "Lema", 1987, "soft", 111, 320);
		theBook[5] = new Book(156, "Rudin", "Turgenev", "Literatura", 1923, "soft", 45, 50);
		theBook[6] = new Book(147, "The Captain's Daughter", "Pushkin", "Literatura", 1990, "hard", 152, 470);
		theBook[7] = new Book(138, "Mumu", "Turgenev", "Literatura", 1943, "soft", 39, 97);
		theBook[8] = new Book(129, "A Hero of Our Time", "Lermontov", "Literatura", 1964, "soft", 84, 100);
		theBook[9] = new Book(210, "Boris Godunov", "Pushkin", "Ecsmo", 1972, "hard", 162, 220);

		printBookListGivenAuthor(theBook, "pushkin");
		printBookListGivenPublisher(theBook, "Ecsmo");
		printBookListAfterGivenYear(theBook, 1960);

	}

	public static void printBookListGivenAuthor(Book[] book, String author) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAuthor().equalsIgnoreCase(author)) {
				System.out.println(book[i].toString());
			}
		}
		System.out.println();
	}

	public static void printBookListGivenPublisher(Book[] book, String publisher) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(book[i].toString());
			}
		}
		System.out.println();
	}

	public static void printBookListAfterGivenYear(Book[] book, int year) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getTheYearOfPublishing() > year) {
				System.out.println(book[i].toString());
			}
		}
	}

}
