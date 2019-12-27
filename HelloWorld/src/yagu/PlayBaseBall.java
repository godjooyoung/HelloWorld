package yagu;

import java.util.Scanner;

public class PlayBaseBall {
public static void main(String[] args) {
	boolean run = true;
	int[] users = new int[3];
	int[] secret =  new int[3];
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("야구게임 시작");
	for (int i = 0 ; i<3; i++) {
		secret[i] = (int)(Math.random()*9)+1; 
	}
	for (int i = 0 ; i<3; i++) {
	System.out.println(secret[i]);
	}
	
	while(run) {
	
		System.out.println("1~9사이의 숫자를 입력해 주세요 : ");
		for(int i = 0; i<3; i++) {
			users [i] =scanner.nextInt();
			scanner.nextLine();
		}
		
		System.out.println("당신이 입력한 숫자는 : " + users[0] + ", " + users[1] + ", " + users[2]);
						
		for (int i=0; i<3; i++) {
			int strike = 0;
			int ball = 0;
		if (users[i] == secret[i]) {
		
			strike++;
			System.out.println("스트라이크! " + strike);
		}
	
	
	
}
}
}
}
