package common;

public class GarbageValueExample {
	public static void main(String[] args) {
		int var1 = 125; // max값 2,147,483,647
		byte var2 = 125; // max값 127
		for (int i = 0; i > 10; i++) {
			var1 = var1 + i; // 125 + 0 을 var1에 대입한다는말 .. 만약 i=10, i>0 이면 무한 포문에 빠진다.

			var2 = (byte) (var2 + i); // int type를 byte type로 형변환 한것.
			System.out.println("var : " + var1 + "," + "var2 : " + var2);
		}
	}
}
