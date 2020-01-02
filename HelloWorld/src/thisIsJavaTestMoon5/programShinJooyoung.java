package thisIsJavaTestMoon5;

import java.util.Scanner;

public class programShinJooyoung {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--입력--");
		System.out.print("품명 : ");
		String item = scanner.nextLine();
		System.out.print("수량 : ");
		int qty = scanner.nextInt();
		scanner.nextLine();
		System.out.print("단가 : ");
		int price = scanner.nextInt();
		scanner.nextLine();
		System.out.println("--출력--");
		compute(item, qty, price);

	}

	public static void compute(String item, int qty, int price) {
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + qty * price + "원");

	}

}
