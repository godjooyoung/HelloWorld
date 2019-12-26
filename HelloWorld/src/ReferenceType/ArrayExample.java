package ReferenceType;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 }; // int 타입의 'intAry'란 이름의 배열 선언,
											// 'int intAry[]' <<도 가능한 표현식임.
		System.out.println("배열주소는 0 부터 시작하므로 3번째 값인 3은 [2]번 자리에 저장 됩니다 : " + intAry[2]);

		intAry[2] = 15;
		System.out.println("배열도 마찬가지로 변수기 때문에 안에 내용을 바꿀수 있습니다." + intAry[2]);

		int sum = 0;
		for (int x = 0; x <= 4; x++) {
			sum = sum + intAry[x]; // System.out.println("인트배열을 더해보자" + sum);
		}

		int sum2 = 0;
		for (int y = 0; y <= 4; y = y + 2) {
			sum2 = sum2 + intAry[y]; // 인트배열중에서 특정 위치만 더해보자

		}

		System.out.println("인트배열을 더해보자" + sum);
		System.out.println("일부분만 더하기  : " + sum2);

		String[] strAry = { "Hello", "Johnny", "Good", "Full Moon", "snow", "LIME" };
		System.out.println(strAry[0]);
		System.out.println(strAry[1]);
		System.out.println("이렇게 하나하나 쳐서 출력하면 참조변수나 다름이 없습니다. 배열은 반복문으로 읽어오면 편합니다.");

		for (int i = 0; i < 6; i++)
			System.out.println("배열을 반복문으로 읽어 왔습니다 :" + strAry[i]);

	}
}

//코드 꼬인거 정리하기.. 괄호 정리하기.. 하 개빡쳐.. 시불탱