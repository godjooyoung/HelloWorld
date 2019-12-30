package classes.Chingu;

public class Chingu {
		private String name;
		private String phone;
		//생성자
		public Chingu (String name, String phone) {
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
			return "친구 [ 이름:" + name + ", 연락처 :" + phone + " ]";
		}
		public void introduce() {
			System.out.println(" 모아보기 >>  이름 :" + name + "  연락처:" + phone );
		
	}
}

