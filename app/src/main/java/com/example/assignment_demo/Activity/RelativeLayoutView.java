package com.example.assignment_demo.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.R;
import com.example.assignment_demo.RelativeLayout.circle;
import com.example.assignment_demo.RelativeLayout.rectangle;
import com.example.assignment_demo.RelativeLayout.triangle;

public class RelativeLayoutView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_view);
        //create objects
        Button Rect, Circle,Triangle,Exit;

        //asign values to objects
        Rect=findViewById(R.id.rect);
        Triangle=findViewById(R.id.triangle);
        Circle=findViewById(R.id.circle);
        Exit= findViewById(R.id.exit);

        // assign funcationality
        Rect.setOnClickListener(this::onClick);
        Triangle.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), triangle.class);
            startActivityForResult(myIntent, 0);
        });
        Circle.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), circle.class);
            startActivityForResult(myIntent, 0);
        });
        Exit.setOnClickListener(view -> {

            Intent myIntent = new Intent(view.getContext(), MainActivity.class);
            startActivityForResult(myIntent, 0);
        });
    }

    private void onClick(View view) {
        Intent myIntent = new Intent(view.getContext(), rectangle.class);
        startActivityForResult(myIntent, 0);

    }
    }
