package com.antwei.meetingsys.fragments;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.antwei.meetingsys.R;
import com.antwei.meetingsys.adapter.LastMeetingAdapter;
import com.antwei.meetingsys.imple.Meeting;
public class FragmentLastMeeting extends Fragment implements
		OnItemClickListener {

	private Context context;
	private Intent intent;
	private TextView tvTitle;
	private GridView gvMeeting;
	private LastMeetingAdapter lastMeetingAdapter;
	private ArrayList<Meeting> meetings;
	private LayoutInflater mInflater;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.context = getActivity().getBaseContext();
		meetings = new ArrayList<Meeting>();
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<20;i++){
					Meeting curMeeting = new Meeting();
					curMeeting.setName("XXX会议"+i);
					meetings.add(curMeeting);
				}
			}
		}.start();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		this.mInflater = inflater;
		View myView = inflater.inflate(R.layout.activity_lastmeeting,
				container, false);
		gvMeeting = (GridView) myView.findViewById(R.id.gv_lastmeeting);
		tvTitle = (TextView) myView.findViewById(R.id.tv_lastmeeting);
		return myView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		lastMeetingAdapter = new LastMeetingAdapter(meetings, context, mInflater);
		gvMeeting.setAdapter(lastMeetingAdapter);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub

	}

}
