package ReferenceType;
import java.util.Scanner;
public class Task01_Program {
public static void main(String[] args) {
	boolean run = true;
	int menu = 0; //메뉴 선택 번호를 받는 변수
	int sum = 0; //점수 합계를 기록할 변수
	double avg = 0; //평균값이 기록될 변수
	int count = 0; // 점수가 입력될때마다 카운터가 한개씩 증가하게 할꺼다. 입력한 학생수를 알게 해줌.
	int n = 0;// 배열의 위치값을 정해줄 변수. 0번째 인덱스에 값을 넣는다. 1번째 인덱스에 값을넣는다.
	int temp = 0; //점수를 입력받아 배열로 넘겨줄 그릇?
	int[] input = new int[5]; //점수입력 메뉴로 부터 입력받은 점수를 저장할 배열
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("*************************");
		System.out.println("1.점수입력   2.합계   3.평균   4.종료");
		System.out.println("*************************");
		System.out.println("메뉴 선택 : ");
		menu = scanner.nextInt();
		scanner.nextLine();
		
		if(menu == 1) {
			 System.out.println("점수를 입력하세요 : ");
			for (n=count; n < input.length; count++) {
				if(input[n]==0) //초기값이 0이므로 0일때만 기록 가능하게 함.. 단 빵점이 젤 앞이나 끝에 있으면 더 많은 입력을 받ㄱ됨.
				temp = scanner.nextInt();
				input[n] = temp;
				n++;
				break;
				}
			sum = sum+temp;
			
			
		}else if (menu ==2) {
			count=n;
			System.out.println("현재까지 입력된 "+ count + "명의 응시자 총점수는  : " + sum  + " 입니다.");
		}else if (menu ==3) {
			avg = sum / count ;
			System.out.println("현재까지 입력된 "+ count + "명의 응시자 평균점수는  : "+ avg +" 입니다.");
		}else if (menu ==4) {
			run = false;
			System.out.println("프로그램이 종료되었습니다.");
		}
	}
}
}
