package ch01;

import java.util.ArrayList;

public class BookDaoArrayList implements BookService {

	ArrayList<Book> books = new ArrayList<>();
    
	/**
	 * Book ��ü�� ArrayList �ڷ� ������ �����ϱ� 
	 */
	@Override
	public void addBook(Book book) {
		System.out.println("�����մϴ�.");
		books.add(book);
		System.out.println(">>>>>> ���� �Էµ� ������ Ȯ�� <<<<<<");
		showAllBook();
	}

	/**
	 * å�� Ÿ��Ʋ�� å ���� ���θ� Ȯ�� 
	 * �ִٸ� �Ű� ������ �Ѿ� ���� book ��ü�� 
	 * ArrayList �� �����͸� ���� 
	 */
	@Override
	public void updateBook(String title, Book book) {
		System.out.println("�����մϴ�.");
		// å�� Ÿ��Ʋ�� �ε��� ��ȣ�� ã�ƾ� �Ѵ�.
		int bookIndex = -1; 
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				bookIndex = i; 
			}
		}
		if(bookIndex == -1) {
			System.out.println(title + " ���� ���� �ʴ� å�Դϴ�.");
		} else {
			books.set(bookIndex, book);
		}
		showAllBook();
	}

	
	/**
	 * å �������� ArrayList�� ��ü�� ���� �մϴ�. 
	 */
	@Override
	public void deleteBook(String title) {
		System.out.println("�����մϴ�.");
		boolean deleteOk = false; 
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				deleteOk = true; 
				books.remove(i);
			}
		}
		if(deleteOk) {
			System.out.println(title + " å�� ���� �Ͽ����ϴ�.");
		} else {
			System.out.println(title + " å�� ���� ���� �ʽ��ϴ�.");
		}
		showAllBook();
	}
	
	
	/**
	 * å �������� �ش��ϴ� ��ü�� ����(Book)�� ��� �մϴ�. 
	 */
	@Override
	public void selectByIdTitle(String title) {
		System.out.println("��ȸ�մϴ�.");
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				System.out.println(books.get(i));
				return; 
			}
		}
		System.out.println(title + " ���� ���� å�� ã�� �� �����ϴ�");
	}
	
	/**
	 *  ArrayList �� ���� �ϴ� ��� �����͸� ��� �մϴ�.
	 */
	@Override
	public void showAllBook() {
		System.out.println("��ü��ȸ�ϱ�");
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
