package ReferenceType;

public class ForArrayExample {
	public static void main(String[] args) {
		/** 1.1부터 10까지 합계구하기 (for구문 사용해서) */
		int sum = 0;
		for (int n = 1; n <= 10; n++) {
			sum = sum + n;
		}
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");

		/** 2.While 구문으로 1부터 10까지 합계구하기 */
		int sum2 = 0;
		int i = 1;
		while (i <= 10) {
			sum2 = sum2 + i;
			i++;
		}
		System.out.println("1부터 10까지 합은 " + sum2 + "입니다.");

		/** 3.1~100까지 수 중에서 3의 배수의 합을 구하자. for 문으로 구하기 */
		int sum3 = 0;
		for (int j = 1; j <= 100; j++) {
			if (j % 3 == 0)
				sum3 = sum3 + j;
		}
		System.out.println("3의 배수의 합은" + sum3 + " 입니다");

		/** 4.1~100까지 수 중에서 7의 배수만 출력하자. */
		int seven = 1;
		for (seven = 1; seven <= 100; seven++) {
			if (seven % 7 == 0)
				System.out.print(seven + " /");
		}
		System.out.println("  ");

		/** random 메소드.. 을 사용해서... 5가 나올경우에만 반복을 끝내기.. 아니라면 계속 출력....while 구문을 사용하자. */
		boolean run = true;
		while (run) {
			int dice = (int) (Math.random() * 6) + 1;
			System.out.println("탈출 실패 : " + dice);
			if (dice == 5) {
				System.out.println("5가 나와서 탈출했습니다. : " + dice);
				run = false;
			}

		}
		int dice2 = 1;
		while (dice2 !=6 ) {
			dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("탈출실패  : " +dice2);
			if(dice2 == 6) {
				System.out.println("6이 나와서 탈출했습니다. : " +dice2 );
				break;
			}
	}
}
}