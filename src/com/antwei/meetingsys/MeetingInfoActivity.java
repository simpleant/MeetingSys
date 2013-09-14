package com.antwei.meetingsys;

import java.lang.reflect.Field;

import com.antwei.meetingsys.adapter.SectionsPagerAdapter;

import android.os.Bundle;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.WindowManager;
import android.widget.TextView;

public class MeetingInfoActivity extends App {

	private SectionsPagerAdapter mPagerAdapter;
	private ViewPager mPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_meetinginfo);
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		PagerTitleStrip mPagerTitleStrip = (PagerTitleStrip)findViewById(R.id.pager_title_strip);
		Field field;
		try {
			field = mPagerTitleStrip.getClass().getDeclaredField("mCurrText");
			field.setAccessible(true);
			TextView view=(TextView) field.get(mPagerTitleStrip);
			view.setTextSize(20f);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
		mPager = (ViewPager)findViewById(R.id.pager);
		mPager.setAdapter(mPagerAdapter);
	}
	

}
