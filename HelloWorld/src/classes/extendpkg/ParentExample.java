package classes.extendpkg;

public class ParentExample {
public static void main(String[] args) {
	Parent parent = new Child();
	//자식인 Child클래스의 인스턴스에 대입가능... 그렇게 되면 페어런트 변수에 맞춰서 부모 스타일 대로 표현됨.
	parent.method1();
	parent.method2();
	//parent.method3(); 
	//브모 클래스에 정의되지 않아 사용 불가
	Child child = (Child) parent;
	//차일드 타입의 child 변수에  parent변수에 있는 값으 ㄹ강제로  Chile 타입으로 형변환을 하고 넣어보자.
	child.filed2 = "date2";
	child.method3();
	
	//Parent parent2 =  new Parent();
	//Child child2 = (Child) parent2;
	//child2.method3();
	/**문법적 오류는 없다.
	 * Exception in thread "main" java.lang.ClassCastException: classes.extendpkg.Parent cannot be cast to classes.extendpkg.Child
	at classes.extendpkg.ParentExample.main(ParentExample.java:17) 
	이러한 오류가 남*/
	
	Parent parent2 =  new Parent();
	if(parent2 instanceof Child) {
	Child child2 = (Child) parent2;
	child2.method3();
	}else {
		System.out.println("패어런트 변수가 차일드 클래스의 인스턴스인지 체크.......형변환을 할수없습니다. :  parent2는  차일드 클래스의 인스턴스와 일치 하지 않습니다. method3이 없음 ㅇㅅaㅇ");
	}
}
}
