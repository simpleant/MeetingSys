package com.antwei.meetingsys.fragments;

import com.antwei.meetingsys.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentMeetingInfo extends Fragment {

	private String infoContent;
	private TextView tvInfoContent;
	private static final String TYPE = "INFOTYPE";
	private int mType;

	public static FragmentMeetingInfo newInstance(int position) {
		FragmentMeetingInfo f = new FragmentMeetingInfo();
		Bundle bundle = new Bundle();
		bundle.putInt(TYPE, position);
		f.setArguments(bundle);
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mType = getArguments() != null ? getArguments().getInt(TYPE) : 1;
		switch (mType) {
		case 0:
			infoContent = getString(R.string.outline);
			break;
		case 1:
			infoContent = getString(R.string.mamber);
			break;
		case 2:
			infoContent = getString(R.string.schedule);
			break;
		case 3:
			infoContent = getString(R.string.rest);
			break;
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View mInfoView = (View) inflater.inflate(R.layout.layout_infopager,
				container, false);
		tvInfoContent = (TextView) mInfoView.findViewById(R.id.tv_meetinginfo);
		return mInfoView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		tvInfoContent.setText(infoContent);
	}

}
