package com.example.myds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	// 1.拦截开机广播
	// 2.启动一个服务1
	// 3.在此服务中拦截分钟变化广播
	// 4.在分钟变化广播中启动服务2
	// 5.在服务2中 do something
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
