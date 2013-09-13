package com.antwei.meetingsys.fragments;

import java.util.ArrayList;

import com.antwei.meetingsys.R;
import com.antwei.meetingsys.adapter.NoticeMeetingAdapter;
import com.antwei.meetingsys.imple.Meeting;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FragmentMeetingAll extends ListFragment {

	private String[] meetingNotice = { "XXX会议", "XXX会议", "XXX会议", "XXX会议",
			"XXX会议", "XXX会议", "XXX会议", "XXX会议", "XXX会议", };

	private Activity activity;
	private Context context;
	private NoticeMeetingAdapter noticeAdapter;
	private ArrayList<Meeting>meetings;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.activity = getActivity();
		this.context = activity.getBaseContext();
		initDate();
		noticeAdapter = new NoticeMeetingAdapter(meetings, context);
		
	}

	private void initDate() {
		// TODO Auto-generated method stub
		meetings = new ArrayList<Meeting>();
		for(int i=0;i<meetingNotice.length;i++){
			Meeting meeting = new Meeting();
			meeting.setName("全国人大常委会第"+i+"次会议");
			meeting.setAddress("第"+i+"会议室");
			meeting.setDate(System.currentTimeMillis());
			meetings.add(meeting);
		}
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View noticeView = inflater.inflate(R.layout.layout_meetinginfo, container, false);
		return  noticeView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		setListAdapter(noticeAdapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		Toast.makeText(context, l.getItemAtPosition(position).toString() , Toast.LENGTH_SHORT).show();
	}
}
