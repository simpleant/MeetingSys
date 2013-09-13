package com.antwei.meetingsys;

import android.os.Bundle;
import android.view.Menu;
import android.view.WindowManager;

public class MeetingInfoActivity extends App {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_meetinginfo);

	}
	

}
