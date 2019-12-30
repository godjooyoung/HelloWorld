package classes.Chingu;

public class HoesaChingu extends Chingu {
	private String company;
	private String dept;
	
	//생성자
	public HoesaChingu(String name, String phone, String company, String dept) {
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

	@Override
	public String toString() {
		return "회사친구 [ 회사:" + company + ", 부서:" + dept + " ]";
	}
	public void introduce() {
		System.out.println(" 모아보기 >>  이름 :" + super.getName() + "  연락처:" + super.getPhone() + "  회사:" + company + "  부서:" +dept);
}
}