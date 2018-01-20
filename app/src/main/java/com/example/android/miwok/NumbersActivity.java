package com.example.android.miwok;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words= new ArrayList<>();

       // LinearLayout rootView= (LinearLayout) findViewById(R.id.rootView);
words.add(new Word("one", "lutti"));
words.add(new Word("three", "otiiko"));
words.add(new Word("four","oyyisa"));
words.add(new Word("five","massokka"));
words.add(new Word("six", "temmokka"));
words.add(new Word("seven" ,"kenekaku"));
words.add(new Word("eight","kawinta"));
words.add(new Word("nine","wo'e"));
words.add(new Word("ten","na'aacha"));

     //   LinearLayout rootView= (LinearLayout) findViewById(R.id.rootView);


        WordAdapter adapter = new WordAdapter(this, 0, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
