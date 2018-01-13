package com.example.franc.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by franc on 30/12/2017.
 */

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.DataObjectHolder> {


    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class DataObjectHolder extends RecyclerView.ViewHolder{
        TextView beneficiario;
        TextView importo;
        TextView scadenza;
        LinearLayout hiddenlayout;
        public DataObjectHolder(View itemView) {
            super(itemView);
/*
            scadenza = itemView.findViewById(R.id.scadenza);
*/

        }

        public void setData(String textscadenza){
            scadenza.setText(textscadenza);


        }

    }

}
