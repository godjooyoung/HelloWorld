package classes;

public class StudentExample {
	/** 스투던트 클래스를 호출할 클래스.. 이때는 메인 함수가 필요하다. */
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");

		Student student = new Student();
		/*
		 * 클래스 변수명 새로운 인스턴스를 만드는것(new 키워드) Student()라는 클래스를 이용해서 새로운 인스턴스를 만들자.. student
		 * 변수에는 Student클래스의 참조 주소가 들어가게 된다
		 */
		System.out.println(student);
		/* classes.Student@15db9742 위치에 스투뎐드란 객체가 있다고 출력됨 */

		student.stuNo = "191234-1234";
		student.university = "yedam";
		student.stuName = "김철수";
		student.age = 20;
		student.major = "English";
		/* 필드 호출 */

		student.dohomework();
		System.out.println(student.major);
		student.introduce();
		/* 메소드 출력 */

		Student student1 = new Student("youngnam", "921111-1111", "박철수");
		student1.introduce();
	}
}
