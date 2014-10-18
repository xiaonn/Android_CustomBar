package com.example.custombar;

import com.example.tools.NavigationUtility;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.RadioGroup.OnCheckedChangeListener;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	public static final String tabIndex0Tag = "0";
	public static final String tabIndex1Tag = "1";
	public static final String tabIndex2Tag = "2";

	public TabHost tabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		NavigationUtility.hideNavigationBar(this);
		setContentView(R.layout.activity_main);

		// 初始化tabBar
		initTabBar();
	}

	public void initTabBar() {
		tabHost = getTabHost();// 从Activity上获取放置table的tableHost

		tabHost.addTab(tabHost.newTabSpec(tabIndex0Tag)
				.setIndicator(tabIndex0Tag)
				.setContent(new Intent(this, FirstActivity.class)));
		tabHost.addTab(tabHost.newTabSpec(tabIndex1Tag)
				.setIndicator(tabIndex1Tag)
				.setContent(new Intent(this, SecondActivity.class)));
		tabHost.addTab(tabHost.newTabSpec(tabIndex2Tag)
				.setIndicator(tabIndex2Tag)
				.setContent(new Intent(this, ThirdActivity.class)));

		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.main_radiogroup);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.RadioButton1:
					tabHost.setCurrentTabByTag(tabIndex0Tag);
					break;
				case R.id.RadioButton2:
					tabHost.setCurrentTabByTag(tabIndex1Tag);
					break;
				case R.id.RadioButton3:
					tabHost.setCurrentTabByTag(tabIndex2Tag);
					break;
				default:
					break;
				}
			}

		});

		RadioButton button = (RadioButton) radioGroup.getChildAt(0);
		button.toggle();

	}

}
