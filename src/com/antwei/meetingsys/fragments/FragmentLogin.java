package com.antwei.meetingsys.fragments;

import com.antwei.meetingsys.R;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FragmentLogin extends Fragment implements OnClickListener {

	private EditText etName, etPass;
	private Button btnLogin, btnQuit;
	private Context context;
	private Activity activity;

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
		etName = (EditText) myView.findViewById(R.id.et_name);
		etPass = (EditText) myView.findViewById(R.id.et_pass);
		btnLogin = (Button)myView.findViewById(R.id.btn_login);
		btnQuit = (Button)myView.findViewById(R.id.btn_quit);
		btnLogin.setOnClickListener(this);	
		btnQuit.setOnClickListener(this);
		return myView;

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_login:
			Toast.makeText(context, "btnLogin be thouched", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_quit:
			getActivity().finish();
			break;
		default:
			break;
		}
	}

}
