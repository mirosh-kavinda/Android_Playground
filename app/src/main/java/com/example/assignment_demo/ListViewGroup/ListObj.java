package com.example.assignment_demo.ListViewGroup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.Activity.ListViewActivity;
import com.example.assignment_demo.Activity.MainActivity;
import com.example.assignment_demo.R;

public class ListObj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_obj);
        //create objects

        Button BAdapter,Adapter,exit;


        //asign values to objects

        Adapter= findViewById(R.id.aadapter);
        BAdapter= findViewById(R.id.badapter);

        exit=  findViewById(R.id.exit);

        // assign funcationality
        BAdapter.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), viewGroup.class);
            startActivityForResult(myIntent, 0);

        });
        Adapter.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), ListViewActivity.class);
            startActivityForResult(myIntent, 0);

        });
        exit.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), MainActivity.class);
            startActivityForResult(myIntent, 0);
        });
    }
}