package com.example.raj.newrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] name;
    int[] img={R.drawable.borabora,R.drawable.canada,R.drawable.dubai,R.drawable.hongkong,R.drawable.iceland,R.drawable.india,
            R.drawable.kenya,R.drawable.london,R.drawable.switzerland,R.drawable.sydney};
    ArrayList<DataProvider> arrayList=new ArrayList<DataProvider>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        name=getResources().getStringArray(R.array.city_names);
        int i=0;
        for (String na:name){
            DataProvider dataProvider = new DataProvider(img[i],na);
            arrayList.add(dataProvider);
            i++;

        }
        adapter=new RecyclerAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
