package beta01;

public class Book implements IShow{

	protected int isbnNo;
	protected String title;
	protected String author;
	
	@Override
	public void showKey() {
		// TODO Auto-generated method stub
		System.out.println("ISBN number: " +isbnNo);
		
	}
	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("Title: " +title);
		System.out.println("Author: " +author);
	}
	
	public Book(int isbnNo, String title, String author) {
		super();
		this.isbnNo = isbnNo;
		this.title = title;
		this.author = author;
	}
	
	
	
	
}
