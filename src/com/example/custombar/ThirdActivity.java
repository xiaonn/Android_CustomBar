package com.example.custombar;

import com.example.base.BaseActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);

		TextView textView = (TextView) findViewById(R.id.title);
		textView.setText("我");
	}
}
