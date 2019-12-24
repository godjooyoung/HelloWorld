package classes;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Person[] perArray = new Person[3];

		Person p1 = new Person("White race", "F", "Amanda", 19);
		Person p2 = new Person("Black race", "F", "Britney", 17);
		Person p3 = new Person("Yellow race", "M", "Door", 15);

		perArray[0] = p1;
		perArray[1] = p2;
		perArray[2] = p3;

		p1.p_i();
		p2.p_i();
		p3.p_i();

		p3.die();
		p1.eat();
		p2.sleep();
		perArray[1].dance();
		perArray[2].happy();
		perArray[0].happy();

		System.out.println("****************************");
		for (int x = 0; x < perArray.length; x++) {
			perArray[x].p_i();
		}

		/** 확장 for문 */
		for (Person ddd : perArray) {
			ddd.aging();
		}

		/*
		 * 기존 for문은 범위를 지정해야함. perArray에 들어있는 값만큼 루프 하겠다.. 그 값을 ddd변수에 넣어서 ddd.p_i를
		 * 실행하겠다.
		 */
		boolean run = true;
		while (run) {
			String ser;
			Scanner scanner = new Scanner(System.in);
			System.out.println("이름을 검색하세요 : ");
			ser = scanner.nextLine();

			for (Person xxx : perArray) {
				if (ser.equals(xxx.person_name))
					xxx.p_i();
				
			}
			
		}

	}
}
