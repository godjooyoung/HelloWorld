package classes.Chingu;

public class ClassExample {
	public static void main(String[] args) {
		Object obj = new Friend();
		System.out.println(obj.hashCode());

		if (obj instanceof Friend) {
			Friend frnd = (Friend) obj;

			System.out.println(frnd.getName() + frnd.getPhone());
		}
		objAry[0] = new Friend("잠이","오면","나는","잠을자");
		objAry[1] = new ComFriend();

		Friend[] fArray = new Friend[10];
	}
}
