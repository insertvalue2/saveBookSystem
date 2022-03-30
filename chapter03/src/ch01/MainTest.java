package ch01;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		

		
//		BookClient bookClient = new BookClient();
//		BookDaoArrayList bookDaoArrayList = new BookDaoArrayList();
//
//		String selectedMenu =  "";
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("--------------------------------------------------");
//			System.out.println("1. 책 생성 2.책 조회 3.책 삭제 4 책 전체 조회 5 책 수정 0. 프로그램 종료");
//			System.out.println("--------------------------------------------------");
//			
//			selectedMenu = sc.nextLine();
//			if (selectedMenu.equals("0")) {
//				System.out.println("프로그램을 종료 합니다.");
//				sc.close();
//			} else if (selectedMenu.equals("1")) {
//				System.out.println("책 제목을 입력하세요");
//				bookClient.inputBookTitle();
//				String title = sc.nextLine();
//				System.out.println("작가 입력하세요");
//				String author = sc.nextLine();
//				Book book = bookClient.createBook(title.trim(), author.trim());
//				bookDaoArrayList.addBook(book);
//			} else if (selectedMenu.equals("2")) {
//				System.out.println("조회 하려는 책 제목을 입력하세요");
//				String title = sc.nextLine();
//				bookDaoArrayList.selectByIdTitle(title);
//			} else if(selectedMenu.equals("3")) {
//				System.out.println("삭제 하려는 책 제목을 입력하세요");
//				String title = sc.nextLine();
//				bookDaoArrayList.deleteBook(title);
//			} else if(selectedMenu.equals("4")) {
//				System.out.println("책 전체 목록을 조회 합니다.");
//				bookDaoArrayList.showAllBook();
//			} else if(selectedMenu.equals("5")) {
//				System.out.println("수정하고 싶은 책에 제목을 입력해주세요");
//				String savedTitle = sc.nextLine();
//				System.out.println("새로운 책 제목을 입력하세요");
//				String title = sc.nextLine();
//				System.out.println("작가 입력하세요");
//				String author = sc.nextLine();
//				//새로운 Book 객체 생성 
//				Book book = bookClient.createBook(title, author);
//				bookDaoArrayList.updateBook(savedTitle, book);
//			}
//		} while (!selectedMenu.endsWith("0"));

//		 테스트 코드
//		Book book = bookClient.createBook();
//		System.out.println(book);

//		int index = bookClient.inputBookIndex();
//		System.out.println(index);

//		String title = bookClient.inputBookTitle();
//		System.out.println(title);

//		String author = bookClient.inputBookAuthor();
//		System.out.println(author);
		
//		String str = "        문자열     가운데     공백      제거         ";
//		String str2 = str.replace(" ", "");
//		System.out.println(str2);
//		String result = removeBlankString(str);
//		System.out.println(result);

	} // end of main 
	
	public static String removeBlankString(String str) {
		String trimStr = str.trim(); 
		String removeCenterBlank = trimStr.replaceAll(" ", "");
		return removeCenterBlank;
	}

}
