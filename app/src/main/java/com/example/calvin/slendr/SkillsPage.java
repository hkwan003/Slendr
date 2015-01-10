package com.example.calvin.slendr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Tricia on 1/10/2015.
 */
public class SkillsPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        TextView startView = new TextView(this);
        startView.setTextSize(50);
        //startView.setText();
    }
}
