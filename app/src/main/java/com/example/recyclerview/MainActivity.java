package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.adapters.RecycleAdapter;
import com.example.recyclerview.models.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> usersList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        usersList = new ArrayList<>();

        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        RecycleAdapter adapter = new RecycleAdapter(usersList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }

    private void setUserInfo() {
        usersList.add(new User("Hoang"));
        usersList.add(new User("Anh"));
        usersList.add(new User("Tu"));
    }
}