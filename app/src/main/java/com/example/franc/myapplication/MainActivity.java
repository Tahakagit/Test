package com.example.franc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    Realm mRealm = Realm.getDefaultInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        RecyclerViewFragment rvfragment = new RecyclerViewFragment();
        LayoutInflater inflater = this.getLayoutInflater();
/*
        final View yourCustomView = inflater.inflate(R.layout., null);
*/

        RecyclerViewFragment.SimpleRVAdapter adapter = new RecyclerViewFragment.SimpleRVAdapter("prova");
        super.onCreate(savedInstanceState);
/*
        RecyclerView rview = findViewById(R.id.recyclerview);
        rview.setAdapter(adapter);
*/

   }
}
