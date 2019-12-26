package classes;

public class Person {
	String race;
	String gender;
	String person_name;
	int person_age;

	Person() {

	}

	/** 기본생성자 */

	Person(String race, String gender, String person_name, int person_age) {
		this.race = race;
		this.gender = gender;
		this.person_name = person_name;
		this.person_age = person_age;
	}

	void eat() {
		System.out.println(person_name + " 님이 음식을 섭취하고 있습니다.");
	}

	void sleep() {
		System.out.println(person_name + " 님이 잠들었습니다.");
	}

	void die() {
		System.out.println(person_name + " 님이 죽었습니다.");
	}

	void dance() {
		System.out.println(person_name + " 님이 춤을 추고 있습니다.");
	}

	void happy() {
		System.out.println(person_name + " 님이 행복해 하고 있습니다.");
	}

	void aging() {
		System.out.println(person_name + " 님의 나이가 " + person_age + "+1세  되었습니다.");
	}

	void p_i() {
		System.out.println("인종은 " + race + ", " + "성별은  " + gender + ", " + "이름은 " + person_name + ".");
	}
}