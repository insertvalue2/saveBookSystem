package ch01;

public class BookClient {

	private static int BookSerialNumber  = 0; 
	
	// book 객체 생성 
	public Book createBook(String title, String author) {
		BookSerialNumber++; 
		return new Book(BookSerialNumber, title, author);
	}
	
	public void inputBookTitle() {
		System.out.println("책 제목을 입력하세요");
	}

	public void inputBookAuthor() {
		System.out.println("작가에 이름을 입력하세요");
	}
	
}
