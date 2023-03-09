package com.example.assignment_demo.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment_demo.ListViewGroup.ListObj;
import com.example.assignment_demo.R;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    TextView textview;
    String[] listitem;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);
        textview = findViewById(R.id.textView);
        listitem = getResources().getStringArray(R.array.array_technologhy);
        Button back= findViewById(R.id.exit);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.mylist, R.id.textView, listitem);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String value = adapter.getItem(position);
            Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
        });
        back.setOnClickListener(view -> {
            int pid = Process.myPid();
            Process.killProcess(pid);
            Intent myIntent = new Intent(view.getContext(), ListObj.class);
            startActivityForResult(myIntent, 0);
        });
    }
}