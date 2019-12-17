package common;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		char c4 = 64;
		int v1 = c1;
		System.out.println("c1: " + c1 + ", " + "c2: " + c2 + ", " + "c3: " +c3);
		/*c1 = (char) (c1);
		c2 = (char) (c1 + 1);
		c3 = (char) (c1 + 2);
		*/
		System.out.println(c1 + "," + c2 + "," + c3);

		for (int i = 0; i < 26; i++) {
			c4 = (char) (c4 + 1);
			System.out.println(c4);
		}

	}
}
