package com.example.mylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Ranking extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private myAdapter myAdapter;
    public static final String[] Cars={"Benz","Audio","BMW","Tesla","Lamborghini","chevrolet","Volkswagen","TOYOTA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        mRecyclerView = findViewById(R.id.rl_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new myAdapter();
        mRecyclerView.setAdapter(myAdapter);
        List<Data> list = new ArrayList<>();
        for(int i = 0; i < Cars.length; ++ i) {
            Data data = new Data(Cars[i]);
            list.add(data);
        }
        myAdapter.setData(list);
        myAdapter.notifyDataSetChanged();
    }
}
