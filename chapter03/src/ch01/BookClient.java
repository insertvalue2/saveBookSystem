package ch01;

public class BookClient {

	private static int BookSerialNumber  = 0; 
	
	// book ��ü ���� 
	public Book createBook(String title, String author) {
		BookSerialNumber++; 
		return new Book(BookSerialNumber, title, author);
	}
	
	public void inputBookTitle() {
		System.out.println("å ������ �Է��ϼ���");
	}

	public void inputBookAuthor() {
		System.out.println("�۰��� �̸��� �Է��ϼ���");
	}
	
}
