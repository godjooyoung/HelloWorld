package HwaginMunje;

import java.util.Scanner; //java  패키지에서 Scanner 클래스를 땡겨쓴다.

public class Teacher {
	public static void main(String[] args) { // scaner 는 사용자가 입력할수 있도록 커서를 깜빡감빡 ㅋ

		// INPUT
		boolean run = true;
		int balance = 0; // 현재잔액 잔고
		int menu = 0;
		int amt = 0; // 예금액을 저장할 변수
		Scanner scanner = new Scanner(System.in);

		// roop
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금  3.잔액  4.종료");
			System.out.println("-----------------------");
			System.out.println("선택 >");
			menu = scanner.nextInt(); // 사용자가 선택한 숫자를 가져오겟다. 그리고 menu 변수에 담겠다.
			scanner.nextLine(); // nextInt가 나오면 nextLine은 따라 온다고 생각하자.
			if (menu == 1) {
				System.out.println("예금액>");
				amt = scanner.nextInt();
				balance = balance + amt;
			} else if (menu == 2) {
				System.out.println("출금액>");
				amt = scanner.nextInt();
				balance = balance - amt;
			} else if (menu == 3) {
				System.out.println("잔고>" + balance);
			} else if (menu == 4) {
				run = false;

			}
		}
	}
}
