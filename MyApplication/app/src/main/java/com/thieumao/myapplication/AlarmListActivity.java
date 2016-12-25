package com.thieumao.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.thieumao.myapplication.adapter.CustomAdapter;
import com.thieumao.myapplication.model.Contact;

import java.util.ArrayList;

public class AlarmListActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private ListView timeListview;
    private String numbers[] = {"0917735100", "0917735101", "0917735102", "0917735103",
            "0917735107", "0917735107", "0917735107", "0917735107", "0917735107", "0917735107",
            "0917735107", "0917735107", "0917735107", "0917735107", "0917735107", "0917735107",
            "0917735107", "0917735107", "0917735107", "0917735107", "0917735107", "0917735107",
            "0917735107", "0917735107", "0917735107", "0917735107", "0917735107", "0917735107",
            "0917735107", "0917735107", "0917735107", "0917735107", "0917735107", "0917735107",
            "0917735107", "0917735107", "0917735107", "0917735107", "0917735107", "0917735107",
            "0917735107", "0917735107", "0917735107", "0917735107", "0917735107", "0917735107"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list);
        timeListview = (ListView) findViewById(R.id.timeListview);
        ArrayList<Contact> arrayList = new ArrayList<>();
        Contact contact1 = new Contact(Color.BLUE, "Nguyen Van Thieu", "0917 735 107");
        Contact contact2 = new Contact(Color.CYAN, "Nguyen Van Thieu", "0917 735 107");
        Contact contact3 = new Contact(Color.YELLOW, "Nguyen Van Thieu", "0917 735 107");
        Contact contact4 = new Contact(Color.RED, "Nguyen Van Thieu", "0917 735 107");
        Contact contact5 = new Contact(Color.GREEN, "Nguyen Van Thieu", "0917 735 107");
        Contact contact6 = new Contact(Color.GRAY, "Nguyen Van Thieu", "0917 735 107");
        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.row_item_contact, arrayList);
        timeListview.setAdapter(customAdapter);
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
//                numbers);
//        timeListview.setAdapter(arrayAdapter);

//        timePicker = (TimePicker) findViewById(R.id.timePicker);
//        setupTimePicker();
    }

//    // Lắng nghe sự kiện khi TimePicker thay đổi
//    public void setupTimePicker(){
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                Toast.makeText(MainActivity.this, "It's :"+hourOfDay+"h:"+minute+"minutes", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

}
