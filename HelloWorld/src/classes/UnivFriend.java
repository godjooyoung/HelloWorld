package classes;

public class UnivFriend extends Friend {
//Friend 클래스를 상속 받겠다.. 상속 받고자 하는 클래스가 뒤에 옴. 
	private String univ;
	private String major;
	//UnivF의 생성자들... 부모클래스의 생성자인  name과 phone를 super로 받아옴.
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}
	//getter setter
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "UnivFriend [univ=" + univ + ", major=" + major + "]";
	}
	
	public void introduce() {
		System.out.println("이름은  " + super.getName() + "이고, 연락처는  " + super.getPhone() + "이고, 학교는 " + univ + "이고, 전공은 " +major);
	
}
}
