package a123;

import java.util.Calendar;

public class CalenderExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 :" + cal.get(Calendar.YEAR));
		System.out.println("월  : " + cal.get(Calendar.MONTH));
		System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
		// 월에서 1월은 0, 12월은 11로 나타남.
		System.out.println("마지막 일 :" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("오늘의 요일 :" + cal.get(Calendar.DAY_OF_WEEK));

		cal.set(2019, 0, 1);

		createCal(2020, 1);
	}

//2020년 2월 달력 구하기
	public static void createCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.println(" ‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡ 달  력  ‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡ ");
		String week[] = { "| 일  |", "| 월  |", "| 화  |", "| 수  |", "| 목  |", "| 금  |", "| 토  |" };
		year = 2020;
		month = 1;
		int dateSet = 1;
		cal.set(year, month, dateSet);
		System.out.println("설정한 마지막 일 :" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("설정한 오늘의 요일 :" + cal.get(Calendar.DAY_OF_WEEK));

		int calbody[][] = new int[7][5];
		int day = 2;
		for (int i = 0; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			for (int x = 1; x < 6; x++) {
				for (int y = 0; y < 4; y++)
					calbody[x][y] = day;
					day= day+1;
			}
		}

		for (int i = 0; i < week.length; i++) {
			System.out.print(" " + week[i]);
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(calbody[i][j] + " *");
				
			}
			System.out.println();
		}

	}
}
