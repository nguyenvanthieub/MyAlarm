package com.thieumao.myalarm.data.listener;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public interface OnClickCheckedChangeItemListener {
    void onClickCheckedChangeItem(View view, RecyclerView.ViewHolder holder, int position);
}
