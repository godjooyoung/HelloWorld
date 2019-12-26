package ReferenceType;

//교재 157쪽 예제, new 연산자로 배열생성하기.
public class ArrayCreateByNewExample157 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println("인트타입 배열 초기값은 다 영임.");
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println("△인트타입 배열 ");

		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("△더블타입 배열");

		String[] arr3 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);

		}
		System.out.println("△스트링타입 배열 초기값 ");
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);

		}

		System.out.println("△스트링타입 배열은 문자열을 담는다");
	}
}