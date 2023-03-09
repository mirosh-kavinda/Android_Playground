package com.example.assignment_demo.Intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.Activity.MainActivity;
import com.example.assignment_demo.R;

public class Level3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        Button finish,menu;
        TextView anstxt;
        RadioGroup rgroup1,rgroup2;


        //asign values to objects
        rgroup1=findViewById(R.id.radioGroup0);
        rgroup2=findViewById(R.id.radioGroup1);
        finish= findViewById(R.id.finish);
        menu=  findViewById(R.id.menu);
        anstxt=findViewById(R.id.anstxt) ;

        // assign funcationality
        menu.setOnClickListener(this::onClick);
        finish.setOnClickListener(view -> {
            String ans1id= String.valueOf(rgroup1.getCheckedRadioButtonId());
            String ans2id= String.valueOf(rgroup2.getCheckedRadioButtonId());

//
            if(ans1id.equals("2131231063") && ans2id.equals("2131231068")){
                anstxt.setText("100% passed");
            }else if("2131231068" != ans2id && ans1id.equals("2131231063") || ans2id.equals("2131231068") && ans1id!="2131231063"){
                anstxt.setText("50% passed");
            }else{
                anstxt.setText("failed the Quiz");
            }


        });
    }

    private void onClick(View view) {
        Intent myIntent = new Intent(view.getContext(), MainActivity.class);
        System.exit(0);
        startActivityForResult(myIntent, 0);

    }
    }
