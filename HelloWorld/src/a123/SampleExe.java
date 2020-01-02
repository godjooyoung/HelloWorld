package a123;

import java.util.Scanner;

public class SampleExe {
	
	public static class Sample {
		int price;
		String item;
		int qty;

		Sample() {

		}

		Sample(int price) {
			this.price = price;
		}

		Sample(int price, String item) {
			this.price = price;
			this.item = item;
		}

	}
	
	public static void main(String[] args) {
		Sample[] samArray = new Sample[100];
		int [] intArray = new int[100];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴 선택 1 2 3");
		int menu = scanner.nextInt();
		scanner.nextLine();

		/*
		 * if(1==1 || 2==1 && 1==i) { System.out.println("오류입니다"); }else { int result =
		 * 3+5;
		 * 
		 * }
		 */

		cal("tests", 3, 1000);
		
		Sample sam = new Sample (30, "apple");
		samArray[0] = new Sample (10);
		System.out.println(sam);
		
	}

	static int cal(String a, int b, int c) {
		/* 코딩짜는 장소.... 원하는 내용을 만들어준다 */
		return 10;

	}


}
//자바의 데이터 유형, 기본타입, 참조타입
//오버로딩