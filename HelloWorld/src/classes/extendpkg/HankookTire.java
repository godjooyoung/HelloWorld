package classes.extendpkg;

public class HankookTire extends Tire {
	public HankookTire (String location, int maxRotation) {
	super(location, maxRotation);
}

@Override
public boolean roll() {
	++accumulateRotation;
	if (accumulateRotation < maxRotation) {
		System.out.println(location + " 한국 타이어 수명:" + (maxRotation - accumulateRotation));
		return true;
	} else {
		System.out.println("***한국 타이어 펑크  *** " + location);
		return false;
	}

}
}
