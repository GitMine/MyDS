package com.example.myds;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService1 extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("MyService1 OnCreate");
	}
	
	@Override
	@Deprecated
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
		System.out.println("MyService1 OnStart");
	}

}
