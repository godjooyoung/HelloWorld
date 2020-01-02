package thisIsJavaTestMoon7;

public class Membership {
	private String memberId; // 회원번호
	private String name; // 회원명
	private String phone;
	
	public Membership() {
		
	}
	
	public Membership(String memberId, String name, String phone) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
		return "@@수영장 회원    ①회원ID:" + memberId + "  ②회원명:" + name + "  ③연락처:" + phone + " ";
	} 
	
	
	
}
