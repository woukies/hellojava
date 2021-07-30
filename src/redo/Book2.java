package redo;

public class Book2 {
	String title;
	String author;

	void show() {
		System.out.println("> " + this.title + " " + this.author);
	}

	public Book2() {
		this("", "");
		System.out.println("생성자1 호출");
	}

	public Book2(String title) {
		this(title, "작자미상");
		System.out.println("생성자2 호출");
	}

	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println("생성자3 호출");
	}

	public static void main(String[] args) {
		Book2 littlePrince = new Book2("어린왕자", "생텍쥐페리");
		littlePrince.show();

		Book2 loveStory = new Book2("춘향전");
		loveStory.show();
		
		Book2 emptyBook = new Book2();
		emptyBook.show();
	}
}
