
public class Driver {
	
	public static void printBook(Book[] bookArray) {
		for(int i = 0; i < bookArray.length; i++) {
			System.out.println("Title: " + bookArray[i].getTitle() + "\nAuthor: " + bookArray[i].getAuthor() + "\nPublished year: " + bookArray[i].getYear() + "\n");
		}
	}
	
	public static void main(String[] args) {
		
		 Book[] bookArr = new Book[2];
		 
		 bookArr[0] = new Book("Harry Potter", "", null, 1678);
		 bookArr[1] = new Book("Happy world", "park", "kuchi", 1987);
		 
		 printBook(bookArr);
		 
		 bookArr[0].setName("Joen", "Lolling");
		 bookArr[1].setName("Park", "Kuchi");
		 bookArr[1].setTitle("Lovely day");
		 bookArr[0].setYear(2001);
		 bookArr[0].setTitle("HHHHarry PPPPoTTTTTer");
		 System.out.println("Printing the book information after update.\n");
		 printBook(bookArr);
		 
		 

	}
	
//	public static void main(String[] args) {
//		 Book book1 = new Book("Harry Potter", "", null, 1678);
//		 Book book2 = new Book("Happy world", "park", "kuchi", 1987);
//		 
//		 System.out.println("Title: " + book1.getTitle() + "\nAuthor: " + book1.getAuthor() + "\nPublished year: " + book1.getYear());
//		 System.out.println("Title: " + book2.getTitle() + "\nAuthor: " + book2.getAuthor() + "\nPublished year: " + book2.getYear());
//
//		 book1.setName("Joen", "Lolling");
//		 
//		 System.out.println("\nPrinting the book information after update.\n");
//		 System.out.println("Title: " + book1.getTitle() + "\nAuthor: " + book1.getAuthor() + "\nPublished year: " + book1.getYear());
//		 System.out.println("Title: " + book2.getTitle() + "\nAuthor: " + book2.getAuthor() + "\nPublished year: " + book2.getYear());
//
//
//	}

}


