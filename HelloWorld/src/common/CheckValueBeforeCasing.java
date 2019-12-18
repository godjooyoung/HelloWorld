package common;

public class CheckValueBeforeCasing {
	public static void main(String[] args) {
				//타입변환하기 전에 값을 체크 하자. 변환으로 인한 데이터 손실, 교재54쪽
		int i = 128;
				/*변수 i를 byte타입으로 바꾸고 싶다. byte 타입의 범위는 -128~127까지이다.
				byte b = (byte) i;*/
				//변수 i가 byte 범위를 벗어나는지 체크하는 if 구문이 있다.
		System.out.println(Byte.MAX_VALUE); 
		System.out.println(Byte.MIN_VALUE);
				//MAX value 와  MInVAlue의 범위를 벗어나지 않는 선에서 변환하고자 한느 프로그램을 짜보자
		if (i>Byte.MAX_VALUE || i<Byte.MIN_VALUE) {
			System.out.println("byte타입으로 변환불가.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}		//만약 바이트 맥스값보다 i가 크거나 민값보다 작으면 변환불가를 출력하고. 그렇지 않으면 변한된 B값을 출력한다.
	}
}
