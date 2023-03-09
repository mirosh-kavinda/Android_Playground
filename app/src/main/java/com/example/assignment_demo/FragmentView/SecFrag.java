package com.example.assignment_demo.FragmentView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.assignment_demo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static SecFrag newInstance(String param1, String param2) {
        SecFrag fragment = new SecFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sec, container, false);
    }

    public static class FragmentView extends AppCompatActivity {
    
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fragment_view);
    
    
            Button FirstFrag,SecondFragment;
            FirstFrag=findViewById(R.id.firstFrag);
            SecondFragment=findViewById(R.id.secondFrag);
    
    
            FirstFrag.setOnClickListener(view -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new firstFrag()).commit();
            });
            SecondFragment.setOnClickListener(view -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new SecFrag()).commit();
    
            });
    
    
        }
        }
}