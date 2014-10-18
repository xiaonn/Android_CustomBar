package com.example.custombar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.base.BaseActivity;
import com.example.model.User;

public class FifthActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fifth);
		
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		User user = (User) bundle.getSerializable("user");
		System.out.println("用户:" + user.name + ", 年龄:"+ user.age + ", 昵称:" + user.nickName);
		
		Button button = (Button)findViewById(R.id.return_button);
		button.setVisibility(1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
}
