package com.example.calvin.slendr;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.annotation.ColorRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Tricia on 1/10/2015.
 */
public class SkillsActivity extends Activity {
    private RecyclerView recView;
    private RecyclerView.Adapter recAdapter;
    private RecyclerView.LayoutManager recManager;
    String [] defaultset = {"Example Language", "Example Design"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        //UI Changes

        //bar.setBackgroundDrawable(new ColorDrawable(ColorDrawable));

        Intent intent = getIntent();
        recView = (RecyclerView) findViewById(R.id.skill_cycle);
        recView.setHasFixedSize(true);
        recManager = new LinearLayoutManager(this);
        recView.setLayoutManager(recManager);
        recAdapter = new RecAdapter(defaultset);
        recView.setAdapter(recAdapter);
    }
}
