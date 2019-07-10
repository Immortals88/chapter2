package com.example.mylist;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter {
    public static final int TYPE_TEXT = 0;
    public static final int TYPE_IMAGE = 1;

    private List<Data> mList;
    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener=onItemClickListener;
    }

    public interface OnItemClickListener{
        void onItemClickListener(View view, int position);
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==TYPE_TEXT){
            View root = LayoutInflater.from(parent.getContext()).
                    inflate(R.layout.layout_data, parent, false);
            return new DemoViewHolder(root);
        }
        else{
            return FigViewHolder.create(parent.getContext(), parent);
        }


    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {

        int type = getItemViewType(position);
        if (type == TYPE_TEXT) {
            ((DemoViewHolder)holder).bind(mList.get(position),position+1);
        } else if (type == TYPE_IMAGE) {
            ((FigViewHolder) holder).bind(mList.get(position), position+1);
        }
        if (onItemClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = holder.getLayoutPosition();
                    onItemClickListener.onItemClickListener(holder.itemView, pos);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    public void setData(List<Data> list) {
        mList = list;
    }
    @Override public int getItemViewType(int position) {
        if (position<5) {
            return TYPE_IMAGE;
        }
        return TYPE_TEXT;
    }


}

