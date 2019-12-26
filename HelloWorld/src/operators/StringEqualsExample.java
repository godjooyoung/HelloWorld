package operators;

public class StringEqualsExample {
	public static void main(String[] args) {

		int num1 = 10;

		String str1 = "신민철";
		String str2 = "신민철";
		String str3 = new String("신민철");
		// str3은 신민철이 따로 만들어지고.. 그 주소값을 다시 설정한다.

		System.out.println("str1 :" + str1);
		System.out.println("str2 :" + str2);
		System.out.println("str3 :" + str3);
		// println은 주소값을 찍지말고 주소를 찾아가서 저장되어있는 내용을 출력하란것이 오버라이딩되어 있기 때문에... 셋다 신민철로 뜸.

		System.out.println("주소값이 같은가? : " + (str1 == str2));
		System.out.println("주소값이 같은가? : " + (str1 == str3));
		System.out.println("저장되어있는 내용이 같은가? : " + str1.equals(str2));
		System.out.println("저장되어있는 내용이 같은가? : " + str1.equals(str3));

		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		if (++var1 > 15 & ++var2 > 30) {
			System.out.println(var1 + " ====" + var2);

		}
		System.out.println(var1 + "," + var2);

		/*
		 * int score = 85; char grade; char grade = (score>90) ? 'A' : 'B' ;
		 * 
		 * 위 아래 문장은 같다.
		 * 
		 * if(score > 90) grade = 'a' ; else { if ( score >80 ) grade = 'b' ; else grade
		 * ='c';
		 */

		int score = 85;
		char grade;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : (score > 70) ? 'C' : (score > 60) ? 'D' : 'F';
		System.out.println(grade);
	}
}
