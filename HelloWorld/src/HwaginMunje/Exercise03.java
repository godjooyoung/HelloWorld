package HwaginMunje;

public class Exercise03 {
	public static void main(String[] args) {
		int sam = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sam = sam + i;
				
				}
			//System.out.println("3의 배수의 합은 ? " + sam); //왜 결과가 이렇게 나오지...?
		}
		System.out.println("3의 배수의 합은 ? " + sam);
	}
}
