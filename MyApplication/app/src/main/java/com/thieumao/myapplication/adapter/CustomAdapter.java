package com.thieumao.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.thieumao.myapplication.R;
import com.thieumao.myapplication.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thieumao on 12/24/16.
 */

public class CustomAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.colorTextview = (TextView) convertView.findViewById(R.id.colorTextview);
            viewHolder.nameTextview = (TextView) convertView.findViewById(R.id.nameTextview);
            viewHolder.numberTextview = (TextView) convertView.findViewById(R.id.numberTextview);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Contact contact = arrContact.get(position);
        viewHolder.colorTextview.setBackgroundColor(contact.getmColor());
        viewHolder.colorTextview.setText(position+1+"");
        viewHolder.nameTextview.setText(contact.getmName());
        viewHolder.numberTextview.setText(contact.getmNumber());
        return convertView;
    }

    public class ViewHolder {
        TextView colorTextview;
        TextView nameTextview;
        TextView numberTextview;
    }

}
