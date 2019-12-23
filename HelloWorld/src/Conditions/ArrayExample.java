package Conditions;

public class ArrayExample {
	public static void main(String[] args) {
		int a = 6, b = 7, c = 3, d = 5, e = 9;
		int maxValue = 0;
		int minValue = 100;
		// 다섯개의 변수에 들어있는 값중 가장 큰수를 maxValue에 대입하는
		// 배열을 이용해보자.

		int[] intAry = { 6, 7, 3, 5, 9 };
		//for (int n = 0; n <= intAry.length; n++) { 처음에 이렇게 해서 포문이 0 1 2 3 4 5 까지 총 6번 돌아서 index out 오류가 났다.
		
		for (int n = 0; n < intAry.length; n++) {
			if (intAry[n] > maxValue)
				maxValue = intAry[n];
		}

		//int minValue = Integer.MAX_VALUE;  인트 변수가 담을수 있는 가장 큰수를 담는 그런거..
		for (int n = 0; n < intAry.length; n++) {
			if (intAry[n] < minValue)
				minValue = intAry[n];
		}
		System.out.println("가장 큰 수는 " + maxValue + " 입니다");
		System.out.println("가장 작은 수는 " + minValue + " 입니다");
	}
}
