package com.example.sportsapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    SportAdapter sportAdapter;
    List<SportModel> sportModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recycler_view);

        sportModelList = new ArrayList<>();
        SportModel sport1 = new SportModel("BasketBall",R.drawable.basketball);
        SportModel sport2 = new SportModel("Football",R.drawable.football);
        SportModel sport3 = new SportModel("Ping Pong",R.drawable.ping);
        SportModel sport4 = new SportModel("Tennis",R.drawable.tennis);
        SportModel sport5 = new SportModel("VolleyBall",R.drawable.volley);

        sportModelList.add(sport1);
        sportModelList.add(sport2);
        sportModelList.add(sport3);
        sportModelList.add(sport4);
        sportModelList.add(sport5);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        sportAdapter = new SportAdapter(sportModelList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sportAdapter);










    }


}