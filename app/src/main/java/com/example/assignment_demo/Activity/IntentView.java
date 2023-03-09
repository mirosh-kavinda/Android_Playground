package com.example.assignment_demo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.Intent.Level1;
import com.example.assignment_demo.Intent.Level2;
import com.example.assignment_demo.Intent.Level3;
import com.example.assignment_demo.R;

public class IntentView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_view);
        //create objects

        Button lvl1,lvl2,lvl3,exit;


        //asign values to objects

        lvl1= findViewById(R.id.lvl1);
        lvl2= findViewById(R.id.lvl2);
        lvl3=  findViewById(R.id.lvl3);
        exit=  findViewById(R.id.exit);

        // assign funcationality
        lvl1.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), Level1.class);
            startActivityForResult(myIntent, 0);

        });
        lvl2.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), Level2.class);
            startActivityForResult(myIntent, 0);

        });
        lvl3.setOnClickListener(view -> {

            Intent myIntent = new Intent(view.getContext(), Level3.class);
            startActivityForResult(myIntent, 0);
        });
        exit.setOnClickListener(view -> {
            int pid = Process.myPid();
            Process.killProcess(pid);

            Intent myIntent = new Intent(view.getContext(), MainActivity.class);
            startActivityForResult(myIntent, 0);
        });

    }
}