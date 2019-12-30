package classes.extendpkg;

public class Child extends Parent{
String filed2;

@Override
void method1() {
	System.out.println("자식클래스의 메소드1");
}

@Override
void method2() {
	System.out.println("자식클래스의 메소드2");
}
void method3() {
	System.out.println("자식클래스의 메소드3");

}
}