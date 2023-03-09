package com.example.assignment_demo.RelativeLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.Activity.RelativeLayoutView;
import com.example.assignment_demo.R;

public class circle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        Context contest =getApplicationContext();
        int duration= Toast.LENGTH_SHORT;
        //create objects
        Button Clear, Menu,Area;
        EditText Radius;
        TextView Ans;

        //asign values to objects

        Clear=findViewById(R.id.clear);
        Area=findViewById(R.id.area);
        Menu=findViewById(R.id.menubtn);
        Radius=findViewById(R.id.radius);

        Ans=findViewById(R.id.answer);


        // assign funcationality
        Menu.setOnClickListener(this::onClick);
        Area.setOnClickListener(view -> {
            if(Radius.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter Radius ?",duration);
                toast.show();
            }else{
                double answer=(Float.parseFloat(Radius.getText().toString().trim()))*2*3.141;
                Ans.setText(String.format("%s", answer));
            }

        });
        Clear.setOnClickListener(view -> {
            Toast toast= Toast.makeText(contest,"Cleared the Result, Try to Enter Again !",duration);
            toast.show();
            Radius.setText("");
            Ans.setText("");

        });
    }

    private void onClick(View view) {

        Intent myIntent = new Intent(view.getContext(), RelativeLayoutView.class);
        startActivityForResult(myIntent, 0);

    }
    }
