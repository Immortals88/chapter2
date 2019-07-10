package com.example.mylist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Ranking extends AppCompatActivity {private RecyclerView mRecyclerView;
    private myAdapter myAdapter1;

    public static final String[] Cars={"Benz","Audio","BMW","Tesla","Lamborghini","chevrolet","Volkswagen","TOYOTA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        mRecyclerView = findViewById(R.id.rl_list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter1 = new myAdapter();
        mRecyclerView.setAdapter(myAdapter1);
        List<Data> list = new ArrayList<>();
        for(int i = 0; i < Cars.length; ++ i) {
            Data data = new Data(Cars[i]);
            list.add(data);
        }
        myAdapter1.setData(list);
        myAdapter1.notifyDataSetChanged();
       myAdapter1.setOnItemClickListener (new myAdapter.OnItemClickListener (){
            @Override
            public void onItemClickListener(View view, int position) {
                //Intent intent=new Intent(Ranking.this, Detail.class);
                //startActivity(intent);
                Toast.makeText(Ranking.this, "no."+position + " clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
