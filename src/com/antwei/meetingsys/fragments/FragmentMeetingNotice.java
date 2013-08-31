package com.antwei.meetingsys.fragments;

import com.antwei.meetingsys.R;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentMeetingNotice extends ListFragment {

	private String[] meetingNotice = { "XXX会议", "XXX会议", "XXX会议", "XXX会议",
			"XXX会议", "XXX会议", "XXX会议", "XXX会议", "XXX会议", };

	private Activity activity;
	private Context context;
	private ArrayAdapter<String> noticeAdapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.activity = getActivity();
		this.context = activity.getBaseContext();
		// noticeAdapter = new ArrayAdapter<String>(context,
		// android.R.layout.simple_list_item_1, meetingNotice);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		noticeAdapter = new ArrayAdapter<String>(context,
				android.R.layout.simple_list_item_1, meetingNotice);
		return inflater.inflate(R.layout.meeting_notice, container, false);
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
		super.onListItemClick(l, v, position, id);
	}
}
