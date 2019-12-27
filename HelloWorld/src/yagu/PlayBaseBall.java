package yagu;

import java.util.Scanner;

public class PlayBaseBall {
	public static void main(String[] args) {
		boolean run = true;
		int[] users = new int[3];
		int[] secret = new int[3];
		int strike = 0;
		int ball = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("야구게임이 시작되었습니다.");
		for (int i = 0; i < 3; i++) {
			secret[i] = (int) (Math.random() * 9) + 1;
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(secret[i] + ".");
		}

		System.out.println(" ");

		while (run) {
			for (int i = 0; i < 3; i++) {
				System.out.println("1 ~ 9 사이의 숫자를 입력해 주세요 : ");
				users[i] = scanner.nextInt();
				scanner.nextLine();
			}
			System.out.println("당신이 입력한 숫자는 : " + users[0] + ", " + users[1] + ", " + users[2] + " 입니다.");

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == j && users[i] == secret[j]) {
						strike++;
					} else if (i != j && users[i] == secret[j]) {
						ball++;
					}
					
					if (strike == 3) {
						System.out.println("축하합니다. 정답입니다.");
						run = (false);
					}
				}
			}
			System.out.println(strike + " strike!");
			System.out.println(ball + " ball!");
			strike = 0;
			ball =0;
			
			
		}
		
	}
}
