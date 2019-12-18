package common;

public class Tesk {
public static void main(String[] args) {
	byte BV =10;
	char CV = 'A';
	
	int IV = BV;
		IV = CV;
		//int타입의 변수에 바이트 타입이나 캐릭터타입 변수가 삽입 가능하다. 에러없음
	short SV = CV;
		// shot 타입 변수인 SV에으는 캐릭터 타입 변수값이던 CV의 A가 입력 불가능 하다. 에러 발생
	   
	double DV = BV;
	 	// 더블 타입 변수 DV에는 바이트 타입 변수인 BV의 10값이 입력 가능하다.
 
	System.out.println(DV);
	
}
}
