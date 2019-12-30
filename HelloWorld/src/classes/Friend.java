package classes;

public class Friend {
	private String name;
	private String phone;
	//생성자
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	//겟셋
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
	//오버라이딩
	@Override
	public String toString() {
		return "Friend 부모 클래스 [name=" + name + ", phone=" + phone + "]";
	}
	public void introduce() {
		System.out.println("이름은  " + name + "이고, 연락처는  " + phone);
	}
	
	
}
