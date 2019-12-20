package HwaginMunje;

public class Exercise04Teacher {
public static void main(String[] args) {
	int num1, num2;
	
	boolean run = true; //무한 반복하게끔 하는 거임. 검색해보자
	
	while(run) {
		num1 =(int)(Math.random()*6)+1;
		num2 =(int)(Math.random()*6)+1;
		System.out.println("(" + num1 + "," + num2+")");
		if(num1+num2==5) {
			run = false;
		}//만약 이조건이 충족되면 run에 false를 넣어서 run 동작을 멈추도록
		
	}
System.out.println("프로그램이 종료 되었습니다.");
}
}
