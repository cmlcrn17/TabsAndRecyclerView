package com.cemilecerenerdem.tabsandrecyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] mDataSet_MaterialName; //hurdaDetail.MaterialName
    private String[] mDataSet_PersentAge;   //hurdaDetail.PersentAge

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public CardView mCardView;
        public TextView mTextView;
        public EditText mEditText;

        public MyViewHolder(View v){
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mTextView = (TextView) v.findViewById(R.id.tv_text);
            mEditText = (EditText) v.findViewById(R.id.edt_text);
        }
    }

    public MyAdapter(String[] myDataSet_MaterialName, String[] myDataSet_PersentAge){
        mDataSet_MaterialName = myDataSet_MaterialName;
        mDataSet_PersentAge = myDataSet_PersentAge;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        holder.mTextView.setText(mDataSet_MaterialName[position]); //hurdaDetail.MaterialName
        holder.mEditText.setText(mDataSet_PersentAge[position]); //hurdaDetail.Persentage
    }

    @Override
    public int getItemCount() { return mDataSet_MaterialName.length; }

}
