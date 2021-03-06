package com.antwei.meetingsys.adapter;

import java.util.List;

import com.antwei.meetingsys.R;
import com.antwei.meetingsys.imple.Meeting;
import com.antwei.meetingsys.util.MyUtils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NoticeMeetingAdapter extends BaseAdapter {

	private List<Meeting> coll;
	private Context context;
	private LayoutInflater mInflater;

	public NoticeMeetingAdapter() {
	}

	public NoticeMeetingAdapter(List<Meeting> coll, Context context) {
		this.coll = coll;
		this.context = context;
		this.mInflater = LayoutInflater.from(context);;
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
			convertView = mInflater.inflate(R.layout.notice_content, null);
			viewHolder.tvName = (TextView) convertView
					.findViewById(R.id.tv_noticename);
			viewHolder.tvDate = (TextView) convertView
					.findViewById(R.id.tv_noticedate);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.tvDate.setText(MyUtils.dateToString(meeting.getDate()));
		viewHolder.tvName.setText(meeting.getName());
		return convertView;
	}

	static class ViewHolder {
		public TextView tvName;
		public TextView tvDate;
	}

}
