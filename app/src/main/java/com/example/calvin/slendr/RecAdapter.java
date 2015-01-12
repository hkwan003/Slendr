package com.example.calvin.slendr;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tricia on 1/11/2015.
 */
public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {
    private String[] dataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }

    public RecAdapter(String[] set) {
        dataset = set;
    }
    @Override
    public RecAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView view = (TextView)LayoutInflater.from(parent.getContext())
                .inflate(R.layout.skills_text_layout, parent, false);
        //Set View size, margins, padding, parameters
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(dataset[position]);
    }
    @Override
    public int getItemCount(){
        return dataset.length;
    }
}
