package com.example.myds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	// 1.���ؿ����㲥
	// 2.����һ������1
	// 3.�ڴ˷��������ط��ӱ仯�㲥
	// 4.�ڷ��ӱ仯�㲥����������2
	// 5.�ڷ���2�� do something
	private String action = "android.intent.action.BOOT_MYAPP";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.sendBootBroadCast();
	}

	private void sendBootBroadCast() {
		Intent intent = new Intent(this.action);

		sendBroadcast(intent);
	}
}
