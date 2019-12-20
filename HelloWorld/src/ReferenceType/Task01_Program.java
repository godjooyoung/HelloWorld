package ReferenceType;
import java.util.Scanner;
public class Task01_Program {
public static void main(String[] args) {
	boolean run = true;
	int menu = 0;
	int sum = 0;
	int avg = 0;
	int[] input = new int[5];
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("*************************");
		System.out.println("1.점수입력   2.합계   3.평균   4.종료");
		System.out.println("*************************");
		System.out.println("메뉴 선택 : ");
		menu = scanner.nextInt();
		scanner.nextLine();
		if(menu == 1) {
			 int score = 0;
			System.out.println("점수를 입력하세요 : ");
			for (int n = 0; n < input.length; n++) {
				if(n==0);
				score = scanner.nextInt();
				input[n] = score;
				break;
				}
			sum = sum+score;
			
		}else if (menu ==2) {
			System.out.println("현재까지 입력된 응시자 총 점수는  : " + sum  + " 입니다.");
		}else if (menu ==3) {
			avg = sum/ ;
			System.out.println("현재까지 입력된 응시자들의 평균점수는  : "+ avg +" 입니다.");
		}else if (menu ==4) {
			run = false;
			System.out.println("프로그램이 종료되었습니다.");
		}
	}
}
}
