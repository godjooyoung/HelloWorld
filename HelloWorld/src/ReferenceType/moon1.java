package ReferenceType;

public class moon1 {
	public static void main(String[] args) {
		/** int 타입 이차원 배열에 1~25까지 넣어보자. */
		/* input */
		int[][] array = new int[5][5];
		int x = 0;
		int y = 0;
		int n = 1;
		for (x = 0; x < array.length; x++) {
			for (y = 0; y < array.length; y++) {
				array[x][y] = n;
				n++;
			}
		}
		/* output, 다양한 방향으로 출력해보기 */
		for (x = 0; x < array.length; x++) {
			for (y = 0; y < array.length; y++) {
				System.out.print(array[x][y] + "  ");
			}
			System.out.println("┚");
		}
		System.out.println(" ");

		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");

		System.out.println(" ");

		for (y = 0; y < array.length; y++) {
			for (x = 0; x < array.length; x++) {
				System.out.print(array[x][y] + "  ");
			}
			System.out.println("┚");
		}
		System.out.println(" ");
		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		System.out.println(" ");

		for (x = array.length - 1; x >= 0; x--) {
			for (y = 0; y < 5; y++) {
				System.out.print(array[x][y] + "  ");
			}
			System.out.println("┚");
		}
	}
}
