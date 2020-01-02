package testPackage;

import java.util.Scanner;

public class mun2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.print("점수 입력 : ");
			int score = scanner.nextInt();

			if (score < 0 || score > 100) {
				System.out.println("입력오류!!");
			} else if (score >= 0) {
				System.out.print("입력된 값 : " + score);
				run = false;
			}

		}
	}
}
