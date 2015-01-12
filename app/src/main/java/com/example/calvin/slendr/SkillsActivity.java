package com.example.calvin.slendr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


/**
 * Created by Tricia on 1/10/2015.
 */
public class SkillsActivity extends Activity {
    private RecyclerView recView;
    private RecyclerView.Adapter recAdapter;
    private RecyclerView.LayoutManager recManager;
    String [] defaultset = {"Example Language", "Example Design"};
    ArrayList<String> customset;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        Intent intent = getIntent();
        recView = (RecyclerView) findViewById(R.id.skill_cycle);
        recView.setHasFixedSize(true);
        recManager = new LinearLayoutManager(this);
        recView.setLayoutManager(recManager);
        recAdapter = new RecAdapter(defaultset);
        recView.setAdapter(recAdapter);
    }
}
