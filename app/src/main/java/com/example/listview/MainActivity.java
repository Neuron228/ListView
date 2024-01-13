package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] data = {"BenchPress", "Squats", "Deadlifts", "Overhead Press", "Bicep Curls","Tricep Dips", "Lunges", "Pull-Ups", "Lat Pulldowns", "Leg Press", "Plank", "Russian Twists", "Shoulder Shrugs", "Leg Extensions","Calf Raises", "Hamstring Curls", "Chest Flyes", "Seated Rows", "Tricep Kickbacks"};
        adapter = new MyAdapter(data);

        recyclerView.setAdapter(adapter);
    }
}