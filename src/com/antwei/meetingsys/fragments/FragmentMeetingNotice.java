package com.antwei.meetingsys.fragments;

import com.antwei.meetingsys.R;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentMeetingNotice extends ListFragment {

	private String[] meetingNotice = {"XXX会议","XXX会议","XXX会议","XXX会议","XXX会议","XXX会议"};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.meeting_notice, container, false);
		
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}
}
