package classes;

public class Calculator {
/*메소드를 몇가지 정의해보자*/
	int plus (int x, int y) {
		return x+y;
	}
	double avg(int a, int b) {
		int sum = plus(a,b);
		double average = sum / 2.0;
		return average;
	}
	void execute() {
		int a= 10, b=20;
		double result = avg(a,b);
		println("결과값은 : " + result);
	}
	void println(String str) {
		System.out.println(str);
	}
}
