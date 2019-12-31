package classes.Chingu;

public class Friend {
private String name;
private String phone;
public Friend(String name, String phone) {
	super();
	this.name = name;
	this.phone = phone;
}
public Friend() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
	
}
@Override
public String toString() {
	return "Friend [name=" + name + ", phone=" + phone + "]";
}
public void introduce() {
	System.out.println("이름은"+ name +"연락처는" +phone);
}
}

