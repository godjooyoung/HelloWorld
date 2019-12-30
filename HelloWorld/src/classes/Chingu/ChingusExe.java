package classes.Chingu;

import java.util.Scanner;

public class ChingusExe {

	private static ChingusExe[] chinArr = new ChingusExe[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("1.입력    2.검색    3.친구목록    4.종료");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("메뉴를 선택해 주세요 >> ");

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
			String fName = scanner.nextLine();

			System.out.println("친구 연락처를 입력해주세요. >> ");
			String fPhone = scanner.nextLine();

			ChingusExe inputChingu = new ChingusExe();

			System.out.println("저장되었습니다.");

		} else if (fNo == 2) {
			System.out.println("대학친구 이름을 입력해주세요. >> ");
			String fName = scanner.nextLine();
			System.out.println("대학친구 연락처를 입력해주세요. >> ");
			String fPhone = scanner.nextLine();
			System.out.println("대학친구 학교를 입력해주세요. >> ");
			String fUniv = scanner.nextLine();
			System.out.println("대학친구 전공을 입력해주세요. >> ");
			String fMajor = scanner.nextLine();

			ChingusExe inputChingu = new ChingusExe(fName, fPhone, fUniv, fMajor);

			System.out.println("저장되었습니다.");
		} else if (fNo == 3) {
			System.out.println("회사친구 이름을 입력해주세요. >> ");
			String fName = scanner.nextLine();
			System.out.println("회사친구 연락처를 입력해주세요. >> ");
			String fPhone = scanner.nextLine();
			System.out.println("회사친구의 회사를 입력해주세요. >> ");
			String fCompany = scanner.nextLine();
			System.out.println("회사친구의 부서를 입력해주세요. >> ");
			String fDept = scanner.nextLine();
			ChingusExe inputChingu = new ChingusExe(fName, fPhone, fCompany, fDept);

			System.out.println("저장되었습니다.");
		}

		for (

				int i = 0; i < chinArr.length; i++) {
			if (chinArr[i] == null) {
				ChingusExe inputChingu = null;
				chinArr[i] = inputChingu;
				break;

			}
		}
	}

	private static void chinguSerch() {
	}

	private static void chinguList() {

	}
}
