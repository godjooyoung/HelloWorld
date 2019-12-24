package classes;

public class Student {
	/*클래스 삼요소 : 필드*/
	String university; 
	String stuNo; /**학번이란 필드를 만듦, 퍼블릭 등의 접근 수준이없는건 기본 접근 수준을 사용하겠단말*/
	String stuName; /**이름*/
	String major; /**전공*/
	int age; /**int나 String은 해당 필드의 반환타입이다. 나이*/
	
	/*클래스 삼요소 : 생성자, 클래스에서 인스턴스를 만들때 생성자를 호출한다. 생성자의 중괄호=필드 안에 매개값을 넣을수 있다. 인스턴스를 만들때 기본으로 받을 값을 넣을수있다.*/
	Student(){
		
	}
	Student(String university, String stuNO, String stuName) {
		this.university = university;
		/**'this'란 키워드로  내 필들의 유니벌시티를 가지고온 걸 알려준다. 마이 필드... 마이 .. 마인...ㅋ*/
		this.stuNo = stuNO;
		this.stuName = stuName;
	}
	
	/*클래스 삼요소 : 메소드*/
	void study() {
		System.out.println("공부한다.");
	}
	void basketball() {
		System.out.println("농구한다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void dohomework() {
		System.out.println("숙제를 한다.");
	}
	
	void introduce() {
		System.out.println("안녕하세요"+university +"의" + stuNo + "학번 " + stuName + "입니다. ");
	}
}

