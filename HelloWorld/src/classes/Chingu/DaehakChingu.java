package classes.Chingu;

public class DaehakChingu extends Chingu {
	private String univ;
	private String major;

	public DaehakChingu(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
}

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
			return "대학친구 [ 학교:" + univ + ", 전공:" + major + " ]";
		}

		public void introduce() {
			System.out.println(" 모아보기 >>  이름 :" + super.getName() + "  연락처:" + super.getPhone() + "  학교:" + univ + "  전공:" +major);
	}
}
