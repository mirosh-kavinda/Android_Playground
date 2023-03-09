package com.example.assignment_demo.ListViewGroup;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.R;

public class viewGroup extends AppCompatActivity {
    ListView listView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_group);
        String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
        int flags[] = {R.drawable.flag_vc, R.drawable.flag_ve, R.drawable.flag_vg, R.drawable.flag_vi, R.drawable.flag_vn, R.drawable.flag_vu};


        listView =  findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        listView.setAdapter(customAdapter);
        Button back= findViewById(R.id.exit);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String value =((TextView)view.findViewById(R.id.textView)).getText().toString();
            Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
        });
        back.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(),  ListObj.class);
            startActivityForResult(myIntent, 0);
        });
    }
}