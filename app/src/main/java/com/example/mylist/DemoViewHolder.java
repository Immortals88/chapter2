package com.example.mylist;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class DemoViewHolder extends RecyclerView.ViewHolder {
    TextView mTextView;
    public DemoViewHolder(View root) {
        super(root);
        mTextView = itemView.findViewById(R.id.tv_data);
    }
    public void bind(Data data) {
        mTextView.setText(data.getInfo());
    }
}
