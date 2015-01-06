package com.example.myds;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver2 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if(intent.getAction().equals("android.intent.action.BOOT_MYAPP2")) {
			Intent mIntent = new Intent(context, MyService1.class);
			context.startService(mIntent);
		}
	}

}
