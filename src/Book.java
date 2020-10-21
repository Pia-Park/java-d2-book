
public class Book {
	//tilte unknown
	//firstname Author john
	//lastname Author Doe
	//int year 1900
	
	private String title;
	private String authorFName;
	private String authorLName;
	private int year;
	private double price; 
	
	
	public Book(String bookTitle, String fName, String lName, int publicYear, double price) {
//		title = bookTitle;
//		author = fName + lName;
//		year = publicYear;
		
		if(bookTitle == "" || bookTitle == null) {
			title = "Unknown";
		} else {
			title = bookTitle;
		}
		
//		if((fName == "" || fName == null)&&(lName == "" || lName == null)) {
//			fName = "Unknown";
//			lName = "Unknown";
//			author = fName + " " + lName;
//		}else if(lName == "" || lName == null) {
//			lName = "Unknown";
//		} else {
//			author = fName + " " + lName;
//		}
		
		if(fName == "" || fName == null) {
			authorFName = "Unknown";
		} else {
			authorFName = fName;
		}
		
		if(lName == "" || lName == null) {
			authorLName = "Unknown";
		} else {
			authorLName = lName;
		}
		
		if(publicYear < 1900) {
			year = 1900;
		} else {
			year = publicYear;
		}
		
		if(price == 0) {
			System.out.print("Unknown");
		} else {
			this.price = price;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return authorFName + " " + authorLName;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setFName(String fName) {
		if(fName == "" || fName == null) {
			authorFName = "Unknown";
		} else {
			authorFName = fName;
		}
	}
	
	public void setLName(String lName) {
		if(lName == "" || lName == null) {
			authorLName = "Unknown";
		} else {
			authorLName = lName;
		}
	}
	
	public void setTitle(String bookTitle) {
		if(bookTitle == "" || bookTitle == null) {
			title = "Unknown";
		} else {
			title = bookTitle;
		}
	}
	
	public void setYear(int publicYear) {
		if(publicYear < 1900) {
			year = 1900;
		} else {
			year = publicYear;
		}
		
	}
	
	public void setPrice(double price) {

		this.price = price;
	}
	
//	public double getTotal() {
//		return this.price;
//	}
	
}

