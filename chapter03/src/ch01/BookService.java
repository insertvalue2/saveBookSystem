package ch01;

public interface BookService {

	void addBook(Book book);
	
	void updateBook(String title, Book book);
	
	void deleteBook(String title);
	
	void selectByIdTitle(String title);
	
	void showAllBook();
}
