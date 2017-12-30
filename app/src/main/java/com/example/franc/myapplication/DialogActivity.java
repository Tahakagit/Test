package com.example.franc.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class DialogActivity extends AppCompatActivity {
    static int i = 0;
    final FragmentManager fragmentManager = getSupportFragmentManager();

    final ArrayList<Fragment> fragments = new ArrayList <>();
    static Button next;
    static Button prev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        fragments.add(new DialogFragmentBeneficiario());
        fragments.add(new DialogFragmentImporto());
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragmentcontainer, fragments.get(i));


        next = findViewById(R.id.next);
        prev = findViewById(R.id.prev);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();

        next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ++i;
                FragmentTransaction ft2 = fragmentManager.beginTransaction();
                ft2.replace(R.id.fragmentcontainer, fragments.get(i));
                ft2.addToBackStack(null);

                ft2.commit();

            }
        } );

        prev.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                --i;
                fragmentTransaction.replace(R.id.fragmentcontainer, fragments.get(i));
            }
        } );




    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(DialogActivity.this, "Oncreateview", Toast.LENGTH_SHORT);


    }

}
