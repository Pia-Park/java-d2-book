
public class Driver {
	
	public static void printBook(Book[] bookArray) {
		for(int i = 0; i < bookArray.length; i++) {
			System.out.println("Title: " + bookArray[i].getTitle() + "\nAuthor: " + bookArray[i].getAuthor() 
					+ "\nPublished year: " + bookArray[i].getYear() + "\nPrice: " + bookArray[i].getPrice() + "Total Price: " + bookArray[i].getTotal() + "\n");
		}
	}
	
	public static void printTotalPrice(Book[] bookArray) {
		double total = 0;

		for(int i = 0; i < bookArray.length; i++) {
			total += bookArray[i].getTotal();
		}
		System.out.println("Total price: " + total);
	}
	
	public static void main(String[] args) {
		
		 Book[] bookArr = new Book[2];
		 
		 bookArr[0] = new Book("Harry Potter", "", null, 1678, 0);
		 bookArr[1] = new Book("Happy world", "park", "kuchi", 1987, 0);
		 
		 printBook(bookArr);
		 
		 bookArr[0].setFName("Joen");
		 bookArr[0].setLName("Lulululu");
		 bookArr[1].setFName("Park");
		 bookArr[1].setTitle("Lovely day");
		 bookArr[0].setYear(2001);
		 bookArr[0].setTitle("HHHHarry PPPPotterrrr");
		 bookArr[0].setPrice(300);
		 bookArr[1].setPrice(100);
		 
		 System.out.println("Printing the book information after update.\n");
		 printBook(bookArr);
		 
		 		 
		 System.out.println("Printing All books Total price.");
		 printTotalPrice(bookArr);
		 
		 

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


