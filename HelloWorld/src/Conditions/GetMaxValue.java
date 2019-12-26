package Conditions;

public class GetMaxValue {
	public static void main(String[] args) {
		int[] Array = { 5, 8, 3, 6, 7 };
		int temp = 0; // 버퍼 역할..
		// 오름차순으로 정렬하자. 이중포문을 이용해서 만들어보자.
		for (int i = 0; i < (Array.length - 1); i++) {
			for (int j = 0; j < (Array.length - 1); j++) {
				if (Array[i] > Array[i + 1]) {
					temp = Array[i];
					Array[i] = Array[i + 1];
					Array[i + 1] = temp;
				}
			}
		}
		for (int n = 0; n < Array.length; n++)
			System.out.print(Array[n]);
	}

}
