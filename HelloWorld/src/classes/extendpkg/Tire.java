package classes.extendpkg;

public class Tire {
	int maxRotation; //사용가능한 회전수 
	int accumulateRotation; //현재까지 회전수
	String location; // 바퀴 장착위치 앞오, 앞왼, 뒤오, 뒤왼
	public Tire (String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "  타이어 수명:"+(maxRotation - accumulateRotation));
			return true;
		}else {
			System.out.println("*** 타이어 펑크  *** " + location);
			return false;
			
		}
	}
}
