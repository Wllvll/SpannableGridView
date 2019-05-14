package com.testapp.spannablegridview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecycleViewHolder>  {

    ArrayList<String> SubjectNames;
    public Context ctx;
    View view1;

    public RecyclerViewAdapter(Context context, ArrayList<String> SubjectNames1) {
        this.ctx = context;
        this.SubjectNames = SubjectNames1;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_item, viewGroup, false);
        RecycleViewHolder holder = new RecycleViewHolder(view);
        return holder;
        //view1  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_item, viewGroup, false);

        //return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, final int position) {
        holder.mName.setText(this.SubjectNames.get(position));
        //holder.id = userModelArrayList.get(position).getId();
    }

    @Override
    public int getItemCount() {
        return this.SubjectNames.size();
    }

    /*@Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder Viewholder, int i) {

        Viewholder.SubjectTextView.setText(SubjectNames.get(i));
        Viewholder.SubjectTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void OnClick(View view) {
                Toast.makeText(view.getContext(), "Position = ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {

        return SubjectNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView SubjectTextView;
        public ViewHolder(View view) {

            super(view);

            SubjectTextView = (TextView)view.findViewById(R.id.textview1);
        }
    }*/

}