package classes.extendpkg;

public class kumhoTire extends Tire {
	public kumhoTire (String location, int maxRotation) {
		super(location, maxRotation);
}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " 금호 타이어 수명:" + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("***금호 타이어 펑크  *** " + location);
			return false;
		}

	}
}
