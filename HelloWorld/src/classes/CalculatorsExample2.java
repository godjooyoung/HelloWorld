package classes;

class Calculators {
	static double PI = 3.14159;
	/** 정적변수라서 대문자로 표시. 만약 정정변수 두단어 이상이면 언더바로 이어서 표기. ex : EARTH_AREA = 456464 */
	String color;

	void setColor(String color) {
		this.color = color;
	}/* 반면 스택틱 타입이 아닌 변수는 생성자를 통해 인스턴스를 생성해야 그제서야 실행됨.인스턴스는 아래 메인에 만들어 보겠다. */

	static int plus(int x, int y) {
		return x + y;
	}/* 스태틱 타입 변수는 인스턴스가 따로 생성되지 않아도 바로 실행됨. */

	static int minus(int a, int b) {
		return a - b;
	}
}// Calculator 클래스

public class CalculatorsExample2 {
	public static void main(String[] args) {
		Calculators cal = new Calculators();
		// cal 인스턴스 선언.
		cal.color = "White";
		cal.setColor("black");
		// 인스턴스 메소드는 반드시 위와 같이 인스턴스 선언후 사용가능.

		cal.plus(4, 5);
		Calculators.plus(6, 7);
		// 정적 메소드는 '클래스명.메소드'의 형태로 따로 인스턴스를 선언하지 않더라도 바로 사용 가능.
	}
}
