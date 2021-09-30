import java.util.Calendar;

public class Hello {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int hours = now.get(Calendar.HOUR_OF_DAY);
		int minutes = now.get(Calendar.MINUTE);

		System.out.println(timeToString(hours, minutes));
		System.out.println(getHello(hours));
	}

	public static String timeToString(int h, int m) {
		StringBuffer s = new StringBuffer();
		s.append("현재 시간은 ");
		s.append(h);
		s.append("시 ");
		s.append(m);
		s.append("분 입니다.");

		return s.toString();
	}

	public static String getHello(int h) {
		if (4 <= h && h < 12) {
			return "Good Morning";
		} else if (12 <= h && h < 18) {
			return "Good Afternoon";
		} else if (18 <= h && h < 22) {
			return "Good Evening";
		} else {
			return "Good Night";
		}
	}
}
