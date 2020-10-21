
public class Book {
	//tilte unknown
	//firstname Author john
	//lastname Author Doe
	//int year 1900
	
	private String title;
	private String author;
	private int year;
	
	
	public Book(String bookTitle, String fName, String lName, int publicYear) {
		title = bookTitle;
		author = fName + lName;
		year = publicYear;
		
		if(bookTitle == "" || bookTitle == null) {
			title = "Unknown";
		} else {
			title = bookTitle;
		}
		if((fName == "" || fName == null)&&(lName == "" || lName == null)) {
			fName = "Unknown";
			lName = "Unknown";
			author = fName + " " + lName;
		}else if(lName == "" || lName == null) {
			lName = "Unknown";
		} else {
			author = fName + " " + lName;
		}
		if(publicYear < 1900) {
			year = 1900;
		} else {
			year = publicYear;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	
}

