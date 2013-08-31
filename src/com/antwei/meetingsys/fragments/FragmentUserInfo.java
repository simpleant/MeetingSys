package com.antwei.meetingsys.fragments;

import com.antwei.meetingsys.ListMeetingActivity;
import com.antwei.meetingsys.R;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentUserInfo extends Fragment implements OnClickListener {

	private Button btnLogin, btnQuit;
	private Context context;
	private Activity activity;
	private Intent intent;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		activity = getActivity();
		context = activity.getBaseContext();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View myView = inflater.inflate(R.layout.layout_login, container, false);
		
		btnLogin = (Button)myView.findViewById(R.id.btn_login);
		btnLogin.setOnClickListener(this);	
		return myView;

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
			Toast.makeText(context, "btnLogin be thouched", Toast.LENGTH_SHORT).show();
			intent = new Intent(context, ListMeetingActivity.class);
			startActivity(intent);
	}

}
