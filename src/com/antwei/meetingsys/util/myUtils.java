package com.antwei.meetingsys.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class myUtils {

	public static final String dateToString(long date) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		calendar.setTimeInMillis(date);

		return day.format(calendar.getTime());
	}
}
