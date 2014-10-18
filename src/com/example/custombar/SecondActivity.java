package com.example.custombar;

import java.io.Serializable;

import com.example.base.BaseActivity;
import com.example.model.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		Button button = (Button) findViewById(R.id.navi_setting);
		button.setVisibility(1);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				User user = new User("王小丫", 16, "翩翩");
				Bundle bundle = new Bundle();
				bundle.putSerializable("user", (Serializable) user);
				
				Intent intent = new Intent();
				intent.setClass(SecondActivity.this, FifthActivity.class);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});

		TextView textView = (TextView) findViewById(R.id.title);
		textView.setText("消息");
	}
}
