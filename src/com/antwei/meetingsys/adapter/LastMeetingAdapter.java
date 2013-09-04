package com.antwei.meetingsys.adapter;

import java.util.List;

import com.antwei.meetingsys.R;
import com.antwei.meetingsys.imple.Meeting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LastMeetingAdapter extends BaseAdapter {

	private List<Meeting> coll;
	private Context context;
	private LayoutInflater mInflater;

	public LastMeetingAdapter() {
	}

	public LastMeetingAdapter(List<Meeting> coll, Context context,
			LayoutInflater mInflater) {
		this.coll = coll;
		this.context = context;
		this.mInflater = mInflater;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return coll.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return coll.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Meeting meeting = coll.get(position);
		ViewHolder viewHolder = new ViewHolder();
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.layout_lastmeetingcontent,
					null);
			viewHolder.tvMeeting = (TextView)convertView.findViewById(R.id.tv_meeting);
			viewHolder.ivMeeting = (ImageView)convertView.findViewById(R.id.iv_meeting);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder)convertView.getTag();
		}
		viewHolder.ivMeeting.setImageResource(R.drawable.icon_lunch);
		viewHolder.tvMeeting.setText(meeting.getName());
		return convertView;
	}

	static class ViewHolder {
		public TextView tvMeeting;
		public ImageView ivMeeting;
	}

}
