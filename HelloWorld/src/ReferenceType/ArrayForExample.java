package ReferenceType;

public class ArrayForExample {
	public static void main(String[] args) {
		// int[] ArrayFor; 배열은 이렇게 배열 먼저 만들고 값을 삽입하는게 안됨. 먼저 배열 사이즈랑 이런걸 정해야 하므로
		// 교재 155쪽 참조. 내용이 없는 빈 배열 미리 만들기.
		int[] ArrayFor = new int[25]; // 총 길이가 25인 배열을 만들었다, 원래 삽입할땐 이러식으로 함. AF[0] = 1; AF[1] = 2;
		System.out.println("배열의 크기 = " + ArrayFor.length);
		int n = 0;
		for (n = 0; n < ArrayFor.length; n++) {
			ArrayFor[n] = n + 1;
		}
		for (int i = 0; i <= 24; i++) {
			System.out.print(" " + ArrayFor[i]);
			if (i % 5 == 4)
				System.out.println(" ˇ ");
		}

		int hab = 0;
		double avg = 0;
		for (int a = 0; a < 25; a++) {
			hab = hab + ArrayFor[a];
		}
		System.out.println("배열의 총 합은  → " + hab);

		avg = hab / ArrayFor.length;
		System.out.println("평균은 → " + avg);
	}
}
