package classes;

public class ComFriend extends Friend {
	private String company;
	private String dept;
	
	//생성자
	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}
	
	//getter setter
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	//to String
	@Override
	public String toString() {
		return "ComFriend [company=" + company + ", dept=" + dept + "]";
	}
	public void introduce() {
		System.out.println("이름은  " + super.getName() + "이고, 연락처는  " + super.getPhone() + "이고, 회사는 " + company + "이고, 부서는 " +dept);
	
	
	
}
}
