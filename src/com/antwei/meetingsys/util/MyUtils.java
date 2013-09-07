package com.antwei.meetingsys.util;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@SuppressLint("SimpleDateFormat")
public class MyUtils {

	public MyUtils() {
	}

	public static final String dateToString(long date) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		calendar.setTimeInMillis(date);
		return day.format(calendar.getTime());
	}
}
