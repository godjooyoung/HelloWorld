package classes;

public class FriendExample {
public static void main(String[] args) {
	UnivFriend uf = new UnivFriend("soomin", "010-2455-9963", "YNUniv", "Medic");
	ComFriend cf = new ComFriend("jooyoung", "010-2733-0129", "YDCom", "Develop");
	Friend f = new Friend("yoona", "010-2223-4444");
	
	//자식클래스인 univ 나 com은 부모 클래스 변수에 할당가능하다.
	Friend f1 = uf;
	Friend f2 = cf;
	
	uf.getName();
	uf.getPhone();
	//위 두개는 부모 클래스인 Friend가 가진 필드다.
	
	uf.getUniv();
	uf.getMajor();
	//위 두개는 자식 클래스인 Univ가 정의한 필드다. 자식클래스는 부모 클래스가 가진 메소드와 필드를 사용할수 있다.
	
	f1.getName();
	f1.getPhone();
	//Friend가 가진 메소드
	
	Friend[] fArray = new Friend[5];
	/*UnivFriend[] uArray = new UnivFriend[5];
	ComFriend[] cArray = new ComFriend[5];
	이렇게 선언가능.. 다 상속..가능...*/
	
	/*fArray[0] = uf;
	fArray[1] = cf;
	fArray[2] = f;*/
	
	for (int i = 0;  i<3; i++) {
		fArray[i].introduce();
	System.out.println(fArray[i]);	
	}
	
	
	
	
}
}