package Conditions;

public class ForPrintFrom1TO100Example {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1에서 100까지 합은 : " + sum);

		int odd = 0;
		for (int y = 1; y <= 100; y += 2) {
			odd = odd + y;
		}
		System.out.println("홀수만 더한 값은 ? " + odd);

		int odd2 = 0;
		for (int x = 1; x <= 100; x++) {
			if (x % 2 == 1) {
				odd2 += x;
			}
		}
		System.out.println("홀수만 더한 값은 : " + odd2);
	}
}
