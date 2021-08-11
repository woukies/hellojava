package redo;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String s, Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int hour = c.get(Calendar.HOUR);
		int hourOfDay = c.get(Calendar.HOUR_OF_DAY);
		int ampm = c.get(Calendar.AM_PM);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND);

		System.out.print(s + year + "-" + month + "-" + day + ".");
		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("일요일");
			break;
		case Calendar.MONDAY:
			System.out.print("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.print("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.print("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.print("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.print("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.print("토요일");
			break;

		default:
			break;
		}

		System.out.print("(" + hourOfDay + "시) ");

		if (ampm == Calendar.AM) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}

		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	}

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("현재 ", now);

		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}
