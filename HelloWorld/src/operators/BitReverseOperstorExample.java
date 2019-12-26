package operators;

public class BitReverseOperstorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		// v2에는 v1변수의 값을 1의 보수화 한걸 대입하게 된다.
		int v3 = v2 + 1;
		// v3에는 v1의 값을 2의 보수화 한걸 대입하게 됨.

		System.out.println("기존값:" + v1 + ", 1의보수화 :" + v2 + ", 2의 보수화 :" + v3);
		System.out.println(toBinaryString(v1) + ", " + v1);
		System.out.println(toBinaryString(v2) + ", " + v2);
		System.out.println(toBinaryString(v3) + ", " + v3);
	}

	public static String toBinaryString(int val) { // toBinaryString 이란 메써드를 정의해주는 과정임.
		String str = Integer.toBinaryString(val);

		System.out.println(str);

		while (str.length() < 32) {
			str = "0" + str;

		} // while 구문 은 반복문... ()의 조건이 참일 경우엔 {}을 계속 하라.
			// ()안에 'str.length()' 는 비트수를 나타냄.. 따라서 10의 이진수는 1010이라서 4가 비트수임. 이게 32보다 작으니까,
			// 'str = "0"+str;을 반복함.01010 →001010→0001010 이런식으로 자리수가 32가 될때까지 반복.
		return str;
	}
}
