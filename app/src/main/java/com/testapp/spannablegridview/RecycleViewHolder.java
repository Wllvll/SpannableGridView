package com.testapp.spannablegridview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RecycleViewHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener{

    TextView mName;
    String id;

    private SparseBooleanArray selectedItems = new SparseBooleanArray();

    public RecycleViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        mName = itemView.findViewById(R.id.textview1);

    }

    @Override
    public void onClick(View view) {
        //проверка существования позиции и обработка клика
        if(selectedItems.get(getAdapterPosition(), true)){
            view.setSelected(true);
            //сохраняем user id в кеш и запускаем PhotosActivity
            //new CacheId(view.getContext()).setString("id", id);
            mHolderClick(view, getAdapterPosition());
        }
    }

    private void mHolderClick(View v, int pos){
        Toast.makeText(v.getContext(), "Position = " + String.valueOf(pos), Toast.LENGTH_SHORT).show();
        //Intent intent = new Intent (v.getContext(), PhotosActivity.class);
        //v.getContext().startActivity(intent);
    }
}