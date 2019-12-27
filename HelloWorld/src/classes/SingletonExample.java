package classes;

class Singleton {
	private static Singleton st = new Singleton();
	static Singleton getInstance() {
		return st;
		/*st란 변수는 getInstance란  메소드를 통해서만 호출가능...*/
	}
	/**집가고..싶다....집.....*/
}

public class SingletonExample {
public static void main(String[] args) {
	/*Singleton st =  new Singleton();*/  
	/** 싱글톤은위 클래서 외부에서 호출 불가능.. 겟 인스턴스 메소드 통해서만 호출 가능.*/
	Singleton st1 = Singleton.getInstance();
	Singleton st2 = Singleton.getInstance();
	
	if(st1 == st2) {
		System.out.println("동일한 객체를 참조하고 있습니다. 즉 객체는 하나고 그걸 다 참조함.");
	}else {
		System.out.println("다른 객체를 참조하고 있습니다.");
	}
}
}
