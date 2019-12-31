package classes;

import calenderExample.Calender;

public class CalenderExe {
public static void main(String[] args) {
	Calender cal = Calender.getInstance();
	System.out.println("년도"+cal.get(Calender.YEAR));
}
}
