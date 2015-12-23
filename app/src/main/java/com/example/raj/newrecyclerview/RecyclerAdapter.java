package com.example.raj.newrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by raj on 23/12/15.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    //We Will Create An Array List That Will Handle The Data provide By The Data Provider

    private ArrayList<DataProvider> arrayList=new ArrayList<DataProvider>();
    public RecyclerAdapter(ArrayList<DataProvider> arrayList){
        this.arrayList=arrayList;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder= new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider dataProvider= arrayList.get(position);
        holder.imageView.setImageResource(dataProvider.getImg_res());
        holder.textView.setText(dataProvider.getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.img);
            textView=(TextView)itemView.findViewById(R.id.name);
        }
    }
}
