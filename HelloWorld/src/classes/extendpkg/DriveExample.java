package classes.extendpkg;

public class DriveExample {
public static void main(String[] args) {
	Driver user = new Driver();
	Vehicle talgutA =  new Vehicle();
	talgutA= new Bus();
	talgutA = new Truck();
	
	user.unjeon(talgutA);
	
	Bus bbus =  new Bus();
	Truck ttruck =  new Truck();
	user.unjeon(ttruck); 
	user.unjeon(bbus);
}
}
