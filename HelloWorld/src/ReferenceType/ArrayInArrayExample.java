package ReferenceType;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] intArray2 = new int[5][4];
		intArray2[0][0] = 1;
		intArray2[0][1] = 2;

		System.out.println("이렇게 하나하나 쳐서 입력할수도 있다." + intArray2[0][0] + "," + intArray2[0][1]);

		int x = 0;
		int y = 0;
		int n = 1;

		for (y = 0; y < 4; y++) {
			for (x = 0; x < 5; x++) {
				intArray2[x][y] = n++;
				System.out.print(intArray2[x][y] + "/  ");
				// 출력을 줄별로 할려면.. 다시 반복문을 써서 출력문을 작성해야한다.
			}
		}

	}
}
