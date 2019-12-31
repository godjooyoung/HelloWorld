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

		createCal(2019, 5);
	}
//2020년 2월 달력 구하기
	public static void createCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		System.out.println(" ‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡ 달  력  ‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡ ");
		String week[] = { "| 일  |", "| 월  |", "| 화  |", "| 수  |", "| 목  |", "| 금  |", "| 토  |" };
		int years = cal.get(year);
		int months =cal.get(month);
		int days []=new int []; 
		for (int i = 0; i < week.length; i++) {
			System.out.print(" " + week[i]);
		}
	}
}
