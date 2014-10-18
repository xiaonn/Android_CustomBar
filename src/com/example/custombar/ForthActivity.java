package com.example.custombar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.base.BaseActivity;

public class ForthActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forth);
		
		Bundle bundle = this.getIntent().getExtras();
		String[] arrName = bundle.getStringArray("arr");
		System.out.println(arrName[0]);
		
		Button button = (Button)findViewById(R.id.return_button);
		button.setVisibility(1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = getIntent();
				Bundle bundle = new Bundle();
				bundle.putString("name", "返回:张三");
				intent.putExtras(bundle);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}
}
