package com.example.myds;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class BootBroadCastReceiver extends BroadcastReceiver {
	private String action = "android.intent.action.BOOT_MYAPP2";
	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
			System.out.println("�յ�һ�������㲥");

		} else if (intent.getAction()
				.equals("android.intent.action.BOOT_MYAPP")) {
			System.out.println("�յ�һ���Զ���㲥");

			Intent mIntent = new Intent(context, Receiver2.class);
			mIntent.setAction(this.action);
			PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, mIntent, 0);
			
			long firstime = SystemClock.elapsedRealtime();  
            AlarmManager am = (AlarmManager) context  
                    .getSystemService(Context.ALARM_SERVICE);  
   
            // 10��һ�����ڣ���ͣ�ķ��͹㲥  
            am.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, firstime,  
                    10 * 1000, pendingIntent);  
		}
	}

}
