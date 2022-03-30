package ch01;

import java.util.ArrayList;

public class BookDaoArrayList implements BookService {

	ArrayList<Book> books = new ArrayList<>();
    
	/**
	 * Book 객체를 ArrayList 자료 구조에 저장하기 
	 */
	@Override
	public void addBook(Book book) {
		System.out.println("저장합니다.");
		books.add(book);
		System.out.println(">>>>>> 현재 입력된 데이터 확인 <<<<<<");
		showAllBook();
	}

	/**
	 * 책에 타이틀로 책 존재 여부를 확인 
	 * 있다면 매개 변수로 넘어 오는 book 객체로 
	 * ArrayList 에 데이터를 수정 
	 */
	@Override
	public void updateBook(String title, Book book) {
		System.out.println("수정합니다.");
		// 책에 타이틀로 인덱스 번호를 찾아야 한다.
		int bookIndex = -1; 
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				bookIndex = i; 
			}
		}
		if(bookIndex == -1) {
			System.out.println(title + " 존재 하지 않는 책입니다.");
		} else {
			books.set(bookIndex, book);
		}
		showAllBook();
	}

	
	/**
	 * 책 제목으로 ArrayList에 객체를 삭제 합니다. 
	 */
	@Override
	public void deleteBook(String title) {
		System.out.println("삭제합니다.");
		boolean deleteOk = false; 
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				deleteOk = true; 
				books.remove(i);
			}
		}
		if(deleteOk) {
			System.out.println(title + " 책을 삭제 하였습니다.");
		} else {
			System.out.println(title + " 책이 존재 하지 않습니다.");
		}
		showAllBook();
	}
	
	
	/**
	 * 책 제목으로 해당하는 객체의 정보(Book)를 출력 합니다. 
	 */
	@Override
	public void selectByIdTitle(String title) {
		System.out.println("조회합니다.");
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equals(title)) {
				System.out.println(books.get(i));
				return; 
			}
		}
		System.out.println(title + " 제목 으로 책을 찾을 수 없습니다");
	}
	
	/**
	 *  ArrayList 에 존재 하는 모든 데이터를 출력 합니다.
	 */
	@Override
	public void showAllBook() {
		System.out.println("전체조회하기");
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
