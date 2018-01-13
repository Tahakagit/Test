package com.example.franc.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by franc on 30/12/2017.
 */

public class RealmContainer extends RealmObject {
    @PrimaryKey
    private String dayOfYear = null;
    private int transactionPerDay = 0;

}
