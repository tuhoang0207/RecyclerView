package com.example.recyclerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.models.User;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {
    private ArrayList<User> usersList;

    public RecycleAdapter(ArrayList<User> usersList) {
        this.usersList = usersList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTxt;

        public MyViewHolder(final View view) {
            super(view);
            nameTxt = view.findViewById(R.id.nameTxt);
        }
    }

    @NonNull
    @Override
    public RecycleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.MyViewHolder holder, int position) {
        String name = usersList.get(position).getUsername();
        holder.nameTxt.setText(name);
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }
}
