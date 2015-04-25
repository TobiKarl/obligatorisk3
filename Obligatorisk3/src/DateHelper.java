import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {

	private Date now = Calendar.getInstance().getTime();
	private DateFormat yearFormat = new SimpleDateFormat("yyyy");
	private DateFormat monthFormat = new SimpleDateFormat("mm");
	private DateFormat weekFormat = new SimpleDateFormat("ww");
	private DateFormat dayFormat = new SimpleDateFormat("dd");
	private DateFormat hourFormat = new SimpleDateFormat("HH");
	private DateFormat minuteFormat = new SimpleDateFormat("mm");
	private DateFormat secondFormat = new SimpleDateFormat("ss");

	private int year = Integer.parseInt(yearFormat.format(now));
	private int month = Integer.parseInt(monthFormat.format(now));
	private int week = Integer.parseInt(weekFormat.format(now));
	private int day = Integer.parseInt(dayFormat.format(now));
	private int hour = Integer.parseInt(hourFormat.format(now));
	private int minute = Integer.parseInt(minuteFormat.format(now));
	private int second = Integer.parseInt(secondFormat.format(now));

	DateHelper() {
	}

	public DateFormat getSecondFormat() {
		return secondFormat;
	}

	public int getSecond() {
		return second;
	}

	public DateFormat getMinuteFormat() {
		return minuteFormat;
	}

	public int getMinute() {
		return minute;
	}

	public Date getNow() {
		return now;
	}

	public DateFormat getYearFormat() {
		return yearFormat;
	}

	public DateFormat getMonthFormat() {
		return monthFormat;
	}

	public DateFormat getWeekFormat() {
		return weekFormat;
	}

	public DateFormat getDayFormat() {
		return dayFormat;
	}

	public DateFormat getHourFormat() {
		return hourFormat;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getWeek() {
		return week;
	}

	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

}
