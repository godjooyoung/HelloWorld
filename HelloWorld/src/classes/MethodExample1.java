package classes;

public class MethodExample1 {
	public static void main(String[] args) {
		/*
		 * showName(); showName("jooyoung"); showAge(26); double result = sum(3.3, 4.5);
		 * 
		 * 
		 * int[] intAry = { 2, 3, 4, 5, 6, 7 }; int sum = 0; for (int i = 0; i <
		 * intAry.length; i++) { sum = sum = intAry[i]; System.out.println("합 : " +
		 * sum); int hab = sum(intAry); }
		 */
		printString(5, "#");
	}

	public static void showName() {
		System.out.println("Hellow, I am Charlie");
	}

	public static void showName(String name) {
		System.out.println("Hellow, I am " + name);
	}

	public static void showAge(int age) {
		System.out.println("Hellow, I am " + age + "year old.");
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int hab(int[] iAry) {
		int hab = 0;
		for (int i = 0; i < iAry.length; i++) {
			hab = hab + iAry[i];
		}
		return hab;
	}

	public static void printString(int x, String str) {
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str);
			}

			System.out.println("Enter!");
		}
	}
}
