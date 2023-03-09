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

public class rectangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);


        Context contest =getApplicationContext();
        int duration= Toast.LENGTH_SHORT;
        //create objects
        Button Clear, Menu,Area;
        EditText Height,Width;
        TextView Ans;

        //asign values to objects

        Clear=findViewById(R.id.cleanbtn);
        Area=findViewById(R.id.area);
        Menu=findViewById(R.id.menubtn);
        Height=findViewById(R.id.height);
        Width=findViewById(R.id.width);
        Ans=findViewById(R.id.answer);


        // assign funcationality
        Menu.setOnClickListener(this::onClick);
        Area.setOnClickListener(view -> {
            if(Height.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter Height ?",duration);
                toast.show();
            }else if(Width.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter Width ?",duration);
                toast.show();
            }else{
                double answer=Float.parseFloat(Width.getText().toString().trim())*Float.parseFloat(Height.getText().toString().trim());
                Ans.setText(String.format("%s", answer));
            }

        });
        Clear.setOnClickListener(view -> {
            Toast toast= Toast.makeText(contest,"Cleared the Result, Try to Enter Again !",duration);
            toast.show();
            Height.setText("");
            Width.setText("");
            Ans.setText("");

        });
    }

    private void onClick(View view) {

        Intent myIntent = new Intent(view.getContext(), RelativeLayoutView.class);
        startActivityForResult(myIntent, 0);

    }
    }
