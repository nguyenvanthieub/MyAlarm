package com.thieumao.myalarm;

import android.app.Application;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class AlarmApplication extends Application {
    public void onCreate() {
        super.onCreate();
        RealmConfiguration configuration = new RealmConfiguration.Builder(this)
                .deleteRealmIfMigrationNeeded().build();
        Realm.setDefaultConfiguration(configuration);
    }
}
