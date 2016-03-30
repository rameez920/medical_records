package arif.nyit.patientData;

import java.util.Calendar;

public class Date {
	int year;
	int month;
	int day;
	
	//returns instance of todays date
	public Date() {
		Calendar today = Calendar.getInstance();
		day = today.get(today.DAY_OF_MONTH);
		month = today.get(today.MONTH);
		year = today.get(today.YEAR);
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	


}
