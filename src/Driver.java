
public class Driver {
	
	public static void main(String[] args) {
		 Book book1 = new Book("Harry Potter", "", null, 1678);
		 Book book2 = new Book("Happy world", "park", "kuchi", 1987);
		 
		 System.out.println("Title: " + book1.getTitle() + "\nAuthor: " + book1.getAuthor() + "\nPublished year: " + book1.getYear());
		 System.out.println("Title: " + book2.getTitle() + "\nAuthor: " + book2.getAuthor() + "\nPublished year: " + book2.getYear());


	}

}
