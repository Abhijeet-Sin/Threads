package Threado;

public class Book implements java.io.Serializable{
	private String authorName;
	private transient int price;
	
	public Book() 
	{
		super();
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Book(String authorName, int price) {
		super();
		this.authorName = authorName;
		this.price = price;
	}
	
	

}
