package com.example.android.miwok;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words=new ArrayList<String>();

       // LinearLayout rootView= (LinearLayout) findViewById(R.id.rootView);
words.add("two");
words.add("three");
words.add("four");
words.add("five");
words.add("six");
words.add("even");
words.add("eight");
words.add("nine");
words.add("ten");

     //   LinearLayout rootView= (LinearLayout) findViewById(R.id.rootView);


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
