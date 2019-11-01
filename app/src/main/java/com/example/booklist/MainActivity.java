package com.example.booklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android, "To Kill A Mocking Bird","1"));
        exampleList.add(new ExampleItem(R.drawable.ic_favorite2, "Drowning In Your Presence","2"));
        exampleList.add(new ExampleItem(R.drawable.ic_airplay, "Harry Potter","3"));
        exampleList.add(new ExampleItem(R.drawable.ic_cloud, "Harry Potter","4"));
        exampleList.add(new ExampleItem(R.drawable.ic_dock, "The Lord of the Ring","5"));
        exampleList.add(new ExampleItem(R.drawable.ic_weekend_black, "The Great Gatsby","1"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background, "Pride and Prejudice","2"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "The Diary of a young girl","3"));
        exampleList.add(new ExampleItem(R.drawable.ic_location_off_black_24dp, "The Book Theif","4"));
        exampleList.add(new ExampleItem(R.drawable.ic_airplanemode_active_black_24dp, "The Hobbit","5"));


        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
