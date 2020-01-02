package testPackage;

import java.util.Scanner;

public class mun3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--입력--");
		System.out.print("Input name : ");
		String inputName = scanner.nextLine();
		System.out.print("kor : ");
		int inputKor = scanner.nextInt();
		scanner.nextLine();
		System.out.print("eng : ");
		int inputEng = scanner.nextInt();
		scanner.nextLine();
		System.out.print("mat : ");
		int inputMat = scanner.nextInt();
		scanner.nextLine();
		
		int sum = inputKor + inputEng +inputMat;
		double avg = sum/3.0;
		String avgresult =String.format("%.1f", avg);
		System.out.println("--출력--");
		System.out.println("이름 : " + inputName);
		System.out.println("합계점수 : " + sum + "점");
		System.out.printf("평균점수 : " + avgresult);
	}

}
