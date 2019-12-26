package Conditions;

public class SwitchExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println("주사위 눈이 1이 나왔습니다.");
			break;
		case 2:
			System.out.println("주사위 눈이 2이 나왔습니다.");
			break;
		case 3:
			System.out.println("주사위 눈이 3이 나왔습니다.");
			break;
		case 4:
			System.out.println("주사위 눈이 4이 나왔습니다.");
			break;
		case 5:
			System.out.println("주사위 눈이 5이 나왔습니다.");
			break;
		case 6:
			System.out.println("주사위 눈이 6이 나왔습니다.");
			break;
		default:
			System.out.println("주사위를 다시 던져주세요");
			break;
		}
	}
}