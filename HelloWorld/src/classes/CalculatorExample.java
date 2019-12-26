package classes;

public class CalculatorExample {
public static void main(String[] args) {
	Calculator cal=new Calculator();
	//Calculator 타입의  cal변수에 Calculator 인스턴스를 담는다.
	cal.execute();
	double avg = cal.avg(30, 50);
	cal.println("두수의 결과값은  " + avg);
}
}
