package com.testapp.spannablegridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*ArrayList<String> numbers = {
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",

    };*/
    ArrayList<String> array;

    RecyclerView recycler;
    RecyclerViewAdapter recAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        array = new ArrayList<String>();
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");
        array.add("123");

        SpannedGridLayoutManager manager = new SpannedGridLayoutManager(
                new SpannedGridLayoutManager.GridSpanLookup() {
                    @Override
                    public SpannedGridLayoutManager.SpanInfo getSpanInfo(int position) {
                        // Conditions for 2x2 items
                        if (position % 6 == 1 || position % 6 == 3) {
                        //if (position % 6 == 0 || position % 6 == 4) {
                            //return new SpannedGridLayoutManager.SpanInfo(1, 1);
                            return new SpannedGridLayoutManager.SpanInfo(2, 2);
                        } else {
                            //return new SpannedGridLayoutManager.SpanInfo(2, 2);
                            return new SpannedGridLayoutManager.SpanInfo(1, 1);
                        }
                    }
                },
                3, // number of columns
                1f // how big is default item
        );

        recycler.setLayoutManager(manager);
        recAdapter = new RecyclerViewAdapter(this, array);
        recycler.setAdapter(recAdapter);
    }
}
