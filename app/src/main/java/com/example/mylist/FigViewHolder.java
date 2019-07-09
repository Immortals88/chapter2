package com.example.mylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FigViewHolder extends RecyclerView.ViewHolder {
    private TextView mTextView;
    private ImageView mImageView;
    public FigViewHolder(@NonNull View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.tv_info);
        mImageView = itemView.findViewById(R.id.iv_image);
    }
    public static FigViewHolder create(Context context, ViewGroup root) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_fig, root, false);
        return new FigViewHolder(v);
    }
    public void bind(Data data) {
        if (null == data) return;
        mTextView.setText(data.getInfo());
        if (data.getInfo() == "BMW") {
            mImageView.setImageResource(R.drawable.bmw);
        }
        else if(data.getInfo()=="Benz"){
            mImageView.setImageResource(R.drawable.benz);
        }
        else if(data.getInfo()=="Audio"){
            mImageView.setImageResource(R.drawable.audio);
        }
        else if(data.getInfo()=="Tesla"){
            mImageView.setImageResource(R.drawable.tesla);
        }
        else
            mImageView.setImageResource(R.drawable.timg);
    }
}
