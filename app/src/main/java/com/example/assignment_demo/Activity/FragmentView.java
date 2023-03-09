package com.example.assignment_demo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.FragmentView.SecFrag;
import com.example.assignment_demo.FragmentView.firstFrag;
import com.example.assignment_demo.R;

public class FragmentView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_view);


        Button FirstFrag,SecondFragment,Back;

        FirstFrag=findViewById(R.id.firstFrag);
        SecondFragment=findViewById(R.id.secondFrag);
        Back=findViewById(R.id.exit);


        FirstFrag.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new firstFrag()).commit();
        });
        SecondFragment.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new SecFrag()).commit();

        });
        Back.setOnClickListener(view -> {
                Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(myIntent, 0);
            });
    }
}