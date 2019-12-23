package ReferenceType;

public class MethodExample {
	public static void main(String[] args) {
		int s1 = sum(3, 5);
		System.out.println("s1은 " + s1 + "입니다.");
		double div1 = divideBy(5, 3);
		System.out.println("div1은 " + div1 + " 입니다.");
		String name1 = printResult("신주영");
		System.out.println(name1);
		double gyesangi = calculator(4,3,"%");
		System.out.println("계산기 결과는 : " + gyesangi);
	}

	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public static void/* 보이드는 리턴타입이 딱히 없단 말..... */ star() {
		System.out.println("*");

	}

	public static double divideBy(int x, int y) {
		double divResult = 0;
		divResult = (double) x / y;
		return divResult;

	}

	public static String printResult(String name) {
		return name + "님, " + "반갑습니다.";
	}

	public static double calculator(int i, int j, String cal) {
		double result = 0;
		
		switch (cal) {
		case "*" :
			result = (double)i*j;
			break;
		case "-" :
			result = (double)i-j;
			break;
		case "+" : 
			result = (double)i+j;
			break;
		case "/" : 
			result = (double)i/j;
			break;
			
		case "%" :
			result = (double)i%j;
			break;
		}
		return result;
		
			}
				

}


