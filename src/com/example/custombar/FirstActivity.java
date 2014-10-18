package com.example.custombar;

import com.example.base.BaseActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends BaseActivity {

	private static final int requesCode = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		Button button = (Button) findViewById(R.id.navi_right);
		button.setVisibility(1);
		button.setText("点击");
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(FirstActivity.this, ForthActivity.class);
				
				String[] arr = new String[]{"张三","李明"};
				
				Bundle bundle = new Bundle();
				bundle.putStringArray("arr",arr);
				intent.putExtras(bundle);
				
				startActivityForResult(intent, requesCode);
			}
		});

		TextView title = (TextView) findViewById(R.id.title);
		title.setText("生活服务");
	}
	
	@SuppressWarnings("static-access")
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if (this.requesCode == requestCode) {
			if (RESULT_OK == resultCode) {
				Bundle bundle = data.getExtras();
				System.out.println(bundle.getString("name"));
			}else{
				System.out.println("cancel");
			}
		}
	}
}
