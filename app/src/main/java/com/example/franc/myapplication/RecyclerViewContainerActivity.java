package com.example.franc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;

import io.realm.Realm;
import io.realm.RealmResults;

public class RecyclerViewContainerActivity extends AppCompatActivity {


    //DB
    static Realm mRealm;
    static RealmResults<RealmContainer> queryListContainer;
    static RealmResults<RealmItem> queryListItems;

    //RECYCLERVIEW
    static AdapterContainerItem adapterListContainer;
    static AdapterItem adapterListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        mRealm = Realm.getDefaultInstance();
        queryListContainer = mRealm.where(RealmContainer.class).findAll();


    }

}
