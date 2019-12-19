package Conditions;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			for (int m = 2; m <= 9; m++)
				System.out.print(m + " x " + n + " = " + (n * m) + "    ");
			System.out.println(" 구구단을 외우자!");
		}

		String star = "*";
		for (int i = 1; i <= 9; i++) { //i가 1에서 9까지 증가하는 동안 아래의 문장을 반복한다.
			for (int j = 1; j <= i; j++) //j가 1을 넣고 아래의 프린트를 실행한다.(별이 하나 찍힘) 그리고 
				System.out.print(star);
			System.out.println();
			// star
			// star star
			// star star star
		/*별이 줄어드는거 출력해보기. self 숙제
		 * 
		 */
		}

	}
}
