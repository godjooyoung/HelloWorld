package classes;

import java.util.Scanner;

public class MemberExample {

	Member[] memberAry = new Member[5];
	Scanner sc = new Scanner(System.in);

	public void execute() {
		int cnt = 0;
		int menu = 1;
		while (true) {
			cnt = 0;
			menu = 1;
			while (true) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("1.생성   2.조회   3.리스트   4.종료");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println("메뉴를 선택해 주세요 >>");
				menu = sc.nextInt();
				sc.nextLine();
				if (menu == 1) {
					createMember();
				} else if (menu == 2) {
					serchMember();
				} else if (menu == 3) {
					listMember();
				} else if (menu == 4) {
					break;
				}
			}
			System.out.println("프로그램 종료");
		}
	}

	public void serchMember() {
		System.out.println("ID 입력 > ");
		String inputId = sc.nextLine();
		System.out.println("PW 입력 >  ");
		String inputPw = sc.nextLine();
		{
			
			if (mem != null) {
				if (inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println(mem);
				}

				else if (inputId.equals(mem.getId()) && inputPw != (mem.getPassword())) {
					System.out.println("※비밀번호를 확인해보세요.※");
				} else if (inputId != (mem.getId()) && inputPw != (mem.getPassword())) {
					System.out.println("※존재하지 않는 아이디 입니다.※");
				}
			}

		}
	}

	public void listMember() {
		for (Member m : memberAry) {
			if (m != null) {
				System.out.println(m);
			}
		}
	}

	public void createMember() {
		Member mem = new Member();
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		mem.setName(name);
		
		System.out.println("ID를 입력하세요. : ");
		String id = sc.nextLine();
		mem.setId(id);

		System.out.println("암호를 입력하세요 : ");
		String password = sc.nextLine();
		mem.setPassword(password);

		// System.out.println("나이를 입력하세요 : ");
		// int age = sc.nextInt();
		// mem.setAge(age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}

	}


}
