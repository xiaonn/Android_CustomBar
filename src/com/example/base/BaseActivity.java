package com.example.base;

import com.example.tools.NavigationUtility;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		NavigationUtility.hideNavigationBar(this);
	}
}
