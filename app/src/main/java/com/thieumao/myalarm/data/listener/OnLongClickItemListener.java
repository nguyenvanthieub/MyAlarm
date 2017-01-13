package com.thieumao.myalarm.data.listener;

import android.view.View;

import com.thieumao.myalarm.ui.adapter.AlarmRecyclerViewAdapter;

public interface OnLongClickItemListener {
    void onLongClickItem(View view, AlarmRecyclerViewAdapter.AlarmViewHolder holder, int position);
}
