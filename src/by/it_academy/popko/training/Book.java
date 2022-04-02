package by.it_academy.popko.training;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private int theYearOfPublishing;
	private String bindingType;
	private int page—ount;
	private int price;

	public Book() {
		id = 0;
		title = null;
		author = null;
		publisher = null;
		theYearOfPublishing = 0;
		bindingType = null;
		page—ount = 0;
		price = 0;
	}

	public int getTheYearOfPublishing() {
		return theYearOfPublishing;
	}

	public void setTheYearOfPublishing(int theYearOfPublishing) {
		this.theYearOfPublishing = theYearOfPublishing;
	}

	public Book(int id1, String title1, String author1, String publisher1, int theYearOfPublishing1,
			String bindingType1, int page—ount1, int price1) {
		if (id1 > 0) {
			this.id = id1;
		} else {
			throw new RuntimeException("invalid value");
		}
		this.title = title1;
		this.author = author1;
		this.publisher = publisher1;
		if (theYearOfPublishing1 > 1800) {
			this.theYearOfPublishing = theYearOfPublishing1;
		} else {
			throw new RuntimeException("invalid value");
		}
		this.bindingType = bindingType1;
		if (page—ount1 > 1) {
			this.page—ount = page—ount1;
		} else {
			throw new RuntimeException("invalid value");
		}
		if (price1 >= 0) {
			this.price = price1;
		} else {
			throw new RuntimeException("invalid value");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public int getPage—ount() {
		return page—ount;
	}

	public void setPage—ount(int page—ount) {
		this.page—ount = page—ount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", theYearOfPublishing=" + theYearOfPublishing + ", bindingType=" + bindingType + ", page—ount="
				+ page—ount + ", price=" + price + "]";
	}

}
