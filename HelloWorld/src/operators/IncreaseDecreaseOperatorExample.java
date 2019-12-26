package operators;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		x++;
		y--;
		System.out.println("X : " + x + " Y: " + y);
		System.out.println(x++);
		// 증감 연산자가 오른쪽에 있으면 문자를 먼저 처리하고 후증감 하게 된다, 실질적은 값은 12지만 처리되기 전 값을 가져온다음에 플러스 일을
		// 한것.
		System.out.println(++x);
		// 증감된 X=12에서 플러스 1을 하고 출력함.

		boolean play = true; // 교재 73쪽 논리부정예제
		System.out.println(play);
		play = !play; // 플레이 변수 자리에 플레이를 논리부정연산 한것을 삽입한다.
		System.out.println(play);

		play = !play;

		for (int i = 0; i < 10; i++) {
			play = !play;
			System.out.println(play);
			if (play)
				System.out.println(play + "한번더 출력");
		}
	}
}
