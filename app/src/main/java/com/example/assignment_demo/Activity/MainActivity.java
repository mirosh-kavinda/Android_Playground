package com.example.assignment_demo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create objects
        Button UserInteract, ListView,IntentView,RelativeLayoutView, FragmentView ,Exit;

        //asign values to objects
        UserInteract=findViewById(R.id.userInteract);
        ListView=findViewById(R.id.listview);
        IntentView=findViewById(R.id.intent);
        RelativeLayoutView=findViewById(R.id.relativelayout);
        FragmentView=findViewById(R.id.fragmentView);
        Exit= findViewById(R.id.exit);

        // assign funcationality


       UserInteract.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), UserInteract.class);
            startActivityForResult(myIntent, 0);
        });
        ListView.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), com.example.assignment_demo.ListViewGroup.ListObj.class);
            startActivityForResult(myIntent, 0);
        });
        IntentView.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), com.example.assignment_demo.Activity.IntentView.class);
            startActivityForResult(myIntent, 0);
        });

        RelativeLayoutView.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), com.example.assignment_demo.Activity.RelativeLayoutView.class);
            startActivityForResult(myIntent, 0);
        });
        FragmentView.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), com.example.assignment_demo.Activity.FragmentView.class);
            startActivityForResult(myIntent, 0);
        });

        Exit.setOnClickListener(view -> {
            int pid = Process.myPid();
            Process.killProcess(pid);
            finish();
            System.exit(0);
        });
    }


    }
