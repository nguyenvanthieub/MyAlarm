package com.thieumao.myalarm.ui.alarms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.thieumao.myalarm.data.Constants;
import com.thieumao.myalarm.utility.AlarmUtils;

public class AlarmBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Constants.ACTION_BOOT_COMPLETED)) {
            AlarmUtils.setupAlarmBoot(context);
        }
    }
}