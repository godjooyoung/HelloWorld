package classes.extendpkg;

public class Car {
//	Tire fl = new Tire("앞 왼쪽", 6);
//	Tire fr = new Tire("앞 오른쪽", 3);
//	Tire bl = new Tire("뒤 왼쪽", 3);
//	Tire br = new Tire("뒤 오른쪽", 4);

	Tire[] tires = {new Tire("앞 왼쪽", 6), new Tire("앞 오른쪽", 3), new Tire("뒤 왼쪽", 3), new Tire("뒤 오른쪽", 4) } ;
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}

	int run() {
		System.out.println("[자동차가 달립니다]");
		for (int i = 0; i<tires.length; i++) {
		if (tires[i].roll() == false) {
			stop();
			return i+1;
		}
		}
		return 0;
		
		
		/**if (fl.roll() == false) {
			stop();
			return 1; // 왼쪽앞
		}
		
		if (fr.roll() == false) {
			stop();
			return 2;// 오른쪽앞
		}
			if (bl.roll() == false) {
				stop();
				return 3;// 왼쪽 뒤
			}
				if (br.roll() == false) {
					stop();
					return 4;// 오뒤
				}
				return 0;*/
}
}
