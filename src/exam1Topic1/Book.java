package exam1Topic1;



//Write a program to accept book details(code, title, author, price) from command line
//a. Write book details into character file "Book.txt" in appending mode
//b. After writing file, read the file and show on the screen.
public class Book {
	private int code;
	private String titile;
	private String author;
	private float price;
	public Book() {
		super();
	}
	public Book(int code, String titile, String author, float price) {
		super();
		this.code = code;
		this.titile = titile;
		this.author = author;
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [code=" + code + ", titile=" + titile + ", author=" + author + ", price=" + price + "]\n";
	}
	
	
	
}
