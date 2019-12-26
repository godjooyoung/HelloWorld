package common;

public class OperatorsExample {
	public static void main(String[] args) {
		int var1 = 100;
		int var2 = 50;
		int result = var1 + var2; // 더하기 연산은 기본적으로 4byte int타입으로 형변환이 이루어 진다. 따라서 var1,var2변수가 byte타입이여도 result의
									// 타입은 int가 되어야 에러가 없다.

		float f1 = 10.1F;
		double f2 = 5.5F;
		double f3 = f1 + f2; // 실수 연산시에도 큰 데이터 타입에 맞추어지게 된다.
		System.out.println("두수의 합은 " + result + " 입니다.");
		System.out.println(var1 + "과" + var2 + "의 합은" + result);
		System.out.println(f3 + "실수의 연산시에도 자동형변화가 이루어 진다.");
	}
}
