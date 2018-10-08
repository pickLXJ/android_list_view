package com.example.xujie.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listViewTest extends AppCompatActivity {

    private String[] data = {   "apple", "banana", "coconut", "lemon",
            "pineapple", "strawberry", "tomato", "watermelon"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        listViewTest.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        }
        }
