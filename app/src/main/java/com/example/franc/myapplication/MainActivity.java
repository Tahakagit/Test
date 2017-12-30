package com.example.franc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    Realm mRealm = Realm.getDefaultInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        final Intent intent = new Intent(this, DialogActivity.class);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(intent);
            }


        } );

   }
}
