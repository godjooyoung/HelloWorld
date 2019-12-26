package HwaginMunje;

public class Exercise04 {
	public static void main(String[] args) {
		int eye1 = (int) (Math.random() * 6) + 1;
		int eye2 = (int) (Math.random() * 6) + 1;

		while (eye1 + eye2 != 5) {
			System.out.println(eye1 + ", " + eye2);
			break;
		}

	}
}
