package redo;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;

	void show() {
//		System.out.printf("%d년 %s국적의 %s가 부른 %s\n", year, country, artist, title);
		System.out.print(year + "년 ");
		System.out.print(country + "국적의 ");
		System.out.print(artist + "가 부른 ");
		System.out.print(title);
	}

	public Song() {
	}

	public Song(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
}
