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
//			System.out.println("1. å ���� 2.å ��ȸ 3.å ���� 4 å ��ü ��ȸ 5 å ���� 0. ���α׷� ����");
//			System.out.println("--------------------------------------------------");
//			
//			selectedMenu = sc.nextLine();
//			if (selectedMenu.equals("0")) {
//				System.out.println("���α׷��� ���� �մϴ�.");
//				sc.close();
//			} else if (selectedMenu.equals("1")) {
//				System.out.println("å ������ �Է��ϼ���");
//				bookClient.inputBookTitle();
//				String title = sc.nextLine();
//				System.out.println("�۰� �Է��ϼ���");
//				String author = sc.nextLine();
//				Book book = bookClient.createBook(title.trim(), author.trim());
//				bookDaoArrayList.addBook(book);
//			} else if (selectedMenu.equals("2")) {
//				System.out.println("��ȸ �Ϸ��� å ������ �Է��ϼ���");
//				String title = sc.nextLine();
//				bookDaoArrayList.selectByIdTitle(title);
//			} else if(selectedMenu.equals("3")) {
//				System.out.println("���� �Ϸ��� å ������ �Է��ϼ���");
//				String title = sc.nextLine();
//				bookDaoArrayList.deleteBook(title);
//			} else if(selectedMenu.equals("4")) {
//				System.out.println("å ��ü ����� ��ȸ �մϴ�.");
//				bookDaoArrayList.showAllBook();
//			} else if(selectedMenu.equals("5")) {
//				System.out.println("�����ϰ� ���� å�� ������ �Է����ּ���");
//				String savedTitle = sc.nextLine();
//				System.out.println("���ο� å ������ �Է��ϼ���");
//				String title = sc.nextLine();
//				System.out.println("�۰� �Է��ϼ���");
//				String author = sc.nextLine();
//				//���ο� Book ��ü ���� 
//				Book book = bookClient.createBook(title, author);
//				bookDaoArrayList.updateBook(savedTitle, book);
//			}
//		} while (!selectedMenu.endsWith("0"));

//		 �׽�Ʈ �ڵ�
//		Book book = bookClient.createBook();
//		System.out.println(book);

//		int index = bookClient.inputBookIndex();
//		System.out.println(index);

//		String title = bookClient.inputBookTitle();
//		System.out.println(title);

//		String author = bookClient.inputBookAuthor();
//		System.out.println(author);
		
//		String str = "        ���ڿ�     ���     ����      ����         ";
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
