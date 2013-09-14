package com.antwei.meetingsys.adapter;

import com.antwei.meetingsys.fragments.FragmentMeetingInfo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

	private String[] TITLES = { "会议简介", "与会人员", "会议日程", "餐饮住宿" };

	public SectionsPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	public SectionsPagerAdapter(FragmentManager fm, String[] tITLES) {
		super(fm);
		TITLES = tITLES;
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return FragmentMeetingInfo.newInstance(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return TITLES.length;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		return TITLES[position];
	}
}
