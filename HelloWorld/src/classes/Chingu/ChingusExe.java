package classes.Chingu;

import java.util.Scanner;




public class ChingusExe {

	static Friend[] chinArr = new Friend[100];
	static Friend baguni = null;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("1.입력    2.검색    3.친구목록    4.종료");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("메뉴를 선택해 주세요 >>");

			int menuNo = scanner.nextInt();
			scanner.nextLine();

			if (menuNo == 1) {
				chinguInput();
			} else if (menuNo == 2) {
				chinguSerch();
			} else if (menuNo == 3) {
				chinguList();
			} else if (menuNo == 4) {
				run = false;
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}

	private static void chinguInput() {

		System.out.println("━━━어떤 친구인가요?━━━");
		System.out.println("1.일반   2.대학    3.회사");
		System.out.println("선택해 주세요 >> ");
		int fNo = scanner.nextInt();
		scanner.nextLine();
		if (fNo == 1) {
			System.out.println("친구 이름을 입력해주세요. >> ");
			String name = scanner.nextLine();

			System.out.println("친구 연락처를 입력해주세요. >> ");
			String phone = scanner.nextLine();

			baguni = new Friend (name, phone);

			System.out.println("저장되었습니다.");

		} else if (fNo == 2) {
			System.out.println("대학친구 이름을 입력해주세요. >> ");
			String name = scanner.nextLine();
			System.out.println("대학친구 연락처를 입력해주세요. >> ");
			String phone = scanner.nextLine();
			System.out.println("대학친구 학교를 입력해주세요. >> ");
			String univ = scanner.nextLine();
			System.out.println("대학친구 전공을 입력해주세요. >> ");
			String major = scanner.nextLine();

			baguni = new UnivFriend (name, phone, univ, major);

			System.out.println("저장되었습니다.");
		} else if (fNo == 3) {
			System.out.println("회사친구 이름을 입력해주세요. >> ");
			String name = scanner.nextLine();
			System.out.println("회사친구 연락처를 입력해주세요. >> ");
			String phone = scanner.nextLine();
			System.out.println("회사친구의 회사를 입력해주세요. >> ");
			String company = scanner.nextLine();
			System.out.println("회사친구의 부서를 입력해주세요. >> ");
			String dept = scanner.nextLine();
			baguni = new ComFriend (name, phone, company, dept);

			System.out.println("저장되었습니다.");
		}

		for (
				int i = 0; i < chinArr.length; i++) {
			if (chinArr[i] == null) {
			chinArr[i] = baguni;
				break;

			}
		}
	}

	private static void chinguSerch() {

		System.out.println("검색할 이름을 입력하세요 >> ");
		String inputKeyword = scanner.nextLine();
		for (Friend a : chinArr) {
			if (a != null) {
				if (inputKeyword.equals(a.getName())) {
					System.out.println("친구가 검색되었습니다.");
					a.introduce();
				}
			}
		}
		
	}

	private static void chinguList() {
		for (Friend aa : chinArr) {
			if (aa != null) {
				aa.introduce();
			}
	}
}
}