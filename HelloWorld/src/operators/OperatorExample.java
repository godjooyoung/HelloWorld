package operators;

public class OperatorExample {
public static void main(String[] args) {
	int result = 0;
	int a =10,  b=20;
				/*result = a+b;
				System.out.println("결과값은 : " + result);*/
	sum(a,b); 
		//sum메써드가 필요한 a,b값을 메인 메써드로 부터 던져주는것임.
		//a,b 자리에 메인메써드 의  int a, intb를 넣는게 아니라 아래 섬 메써드에서 요하는 인트형 숫자 아무거나 넣어도 가능 ㅇㅅㅇa
}
	public static void sum (int a, int b) {   //정수형 변수 a와 b를 합하는 메써드를 만든것. 
	int result = a+b;
	System.out.println("Method 결과값은 : " +result);
	}
}

