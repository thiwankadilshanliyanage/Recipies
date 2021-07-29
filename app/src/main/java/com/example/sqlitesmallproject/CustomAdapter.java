package com.example.sqlitesmallproject;

import android.content.Context;
import android.icu.lang.UScript;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

   private Context context;
   private ArrayList book_id, book_title, book_author, book_pages;

    CustomAdapter(Context context,
                  ArrayList book_id,
                  ArrayList book_title,
                  ArrayList book_author,
                  ArrayList book_pages){
        this.context = context;
        this.book_id = book_id;
        this.book_title = book_title;
        this.book_pages = book_pages;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
