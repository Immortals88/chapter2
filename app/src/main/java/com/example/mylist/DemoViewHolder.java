package com.example.mylist;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class DemoViewHolder extends RecyclerView.ViewHolder {
    TextView mTextView;
    TextView rank;
    public DemoViewHolder(View root) {
        super(root);
        mTextView = itemView.findViewById(R.id.tv_data);
        rank=itemView.findViewById(R.id.tv_rank);
    }
    public void bind(Data data,int position) {
        mTextView.setText(data.getInfo());
        if(position<=3){
            rank.setTextColor(0xe6face15);
        }
        rank.setText(position+".");
    }
}
