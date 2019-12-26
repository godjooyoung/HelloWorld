package classes;

import java.util.Scanner;

public class BankApp {
	private static Account[] accArr = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("1.계좌생성    2.계좌목록    3.예금    4.출금     5.종료");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("메뉴를 선택해 주세요 >> ");

			int menuNo = scanner.nextInt();
			scanner.nextLine();

			if (menuNo == 1) {
				createAcc();
			} else if (menuNo == 2) {
				accList();
			} else if (menuNo == 3) {
				yeGeum();
			} else if (menuNo == 4) {
				chulGeum();
			} else if (menuNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}

	private static void createAcc() {
//	
		Account newAcc = new Account();
		System.out.println("계좌번호를 입력하세요. >> ");
		String ano = scanner.nextLine();
		newAcc.setAno(ano);

		System.out.println("이름을 입력하세요. >>");
		String owner = scanner.nextLine();
		newAcc.setOwner(owner);

		System.out.println("초기입금액을 입력해주세요. >>");
		int balance = scanner.nextInt();
		scanner.nextLine();
		newAcc.setBalance(balance);

		System.out.println("계좌가 생성되었습니다.");

		for (int i = 0; i < accArr.length; i++) {
			if (accArr[i] == null) {
				accArr[i] = newAcc;
				break;
			}
		}
	}

	private static void accList() {
//
		for (Account a : accArr) {
			if (a != null) {
				System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓");
				System.out.println(" 계좌 목록이 출력되었습니다.");
				System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓");
				System.out.println(a);

			}
		}
	}

	private static void yeGeum() {
//
		System.out.println("예금할 계좌번호를 입력하세요 >> ");
		String inputno = scanner.nextLine();
		for (Account a : accArr) {
			if (a != null) {
				if (inputno.equals(a.getAno())) {
					System.out.println("계좌가 조회 되었습니다.");
					System.out.println("예금액을 입력해주세요 >>");
					String inputmoney = scanner.nextLine();
					System.out.println("예금이 성공되었습니다.");
					inputmoney.getBalance() = blance + inputmoney
					
				}
			}
		}
	}

	private static void chulGeum() {
//
	}

}
