package thisIsJavaTestMoon7;

import java.util.Scanner;

public class SwimingProgram {
	private static Membership[] memberArray = new Membership[200];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/** 수영장 회원 관리를 위한 추가, 수정, 삭제, 리스트 메뉴를 구성하고 처리하는 프로그램을 작성하시오. */
		// maemberID, name, phone를 받는다.
		boolean run = true;
		while (run) {
			System.out.println("＠＠수영장 회원관리 프로그램 입니다.");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.회원등록    2.회원정보 수정    3.회원정보 삭제    4.회원리스트    5.프로그램 종료");
			int menuNum = scanner.nextInt();
			scanner.nextLine();

			if (menuNum == 1) {
				joinMemeber();
			} else if (menuNum == 2) {
				editMember();
			} else if (menuNum == 3) {
				deleteMember();
			} else if (menuNum == 4) {
				listMember();
			} else if (menuNum == 5) {
				System.out.println("프로그램이 종료 되었습니다~~.");
				run = false;
			}
		}
	}

	private static void joinMemeber() {
		// 1.회원등록

		Membership newMember = new Membership();

		System.out.println("회원ID를 입력해주세요 : >>");
		String memberId = scanner.nextLine();
		newMember.setMemberId(memberId);

		System.out.println("회원명을 입력해주세요 : >> ");
		String name = scanner.nextLine();
		newMember.setName(name);

		System.out.println("회원 연락처를 입력해주세요 : >>");
		String phone = scanner.nextLine();
		newMember.setPhone(phone);

		System.out.println("회원등록이 완료 되었습니다.");

		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = newMember;
				break;
			}
		}
	}

	private static void editMember() {
		// 2.정보수정.. equal을 써볼까
		System.out.println("회원정보 수정");
		System.out.println("회원 ID를 입력해주세요 : >> ");
		String editMember = scanner.nextLine();
		for (Membership a : memberArray) {
			if (a != null) {
				if (editMember.equals(a.getMemberId())) {
					System.out.println("회원이 조회 되었습니다.");
					System.out.println("1.회원명 변경    2.연락처 변경");
					System.out.println("메뉴를 선택해주세요. >>");

					int menuNum = scanner.nextInt();
					scanner.nextLine();
					switch (menuNum) {
					case 1:
						System.out.println("변경하실 회원명을 입력해주세요 >>");
						String editMemberName = scanner.nextLine();
						a.setName(editMemberName);
						System.out.println("회원명이 성공적으로 변경되었습니다.");
						break;

					case 2:
						System.out.println("변경하실 연락처을 입력해주세요 >>");
						String editMemberPhone = scanner.nextLine();
						a.setPhone(editMemberPhone);
						System.out.println("연락처가 성공적으로 변경되었습니다.");
						break;
					}
				}
			}
		}

	}

	private static void deleteMember() {
		// 3.정보삭제
		System.out.println("※※회원삭제※※");
		System.out.println("※※삭제할 회원 ID를 입력해주세요 : >> ");
		String deleteMember = scanner.nextLine();
		for (Membership a : memberArray) {
			if (a != null) {
				if (deleteMember.equals(a.getMemberId())) {
					System.out.println("회원이 조회 되었습니다.");
					System.out.println("해당 회원을 정말로 삭제하시겠습니까?");
					System.out.println("1.네    2.아니요");
					int menuNum = scanner.nextInt();
					scanner.nextLine();
					switch (menuNum) {
					case 1:
						System.out.println("회원 삭제가 진행중입니다....");
						a.setName(null);
						a.setMemberId(null);
						a.setPhone(null);
						/*if(a.getName()=="null") {
							a=null;
						}*/
						System.out.println("회원 삭제가 완료되었습니다.");
						break;
					case 2:
						System.out.println("회원 삭제를 취소 하였습니다.");
						break;
					}
				}
			}
		}

	}

	private static void listMember() {
		// 4.리스트출력
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("회원목록이 출력되었습니다.");
		for (Membership a : memberArray) {
			if (a != null) {
				System.out.println(a);
			}
		}
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	}
}
