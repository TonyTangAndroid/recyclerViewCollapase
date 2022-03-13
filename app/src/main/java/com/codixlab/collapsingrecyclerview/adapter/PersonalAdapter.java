package com.codixlab.collapsingrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codixlab.collapsingrecyclerview.R;
import com.codixlab.collapsingrecyclerview.model.PersonModel;

import java.util.List;

public class PersonalAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private final Context context;
    private final List<PersonModel> itemList;

    public PersonalAdapter(Context context, List<PersonModel> list) {
        this.context = context;
        this.itemList = list;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View inflate = inflater.inflate(R.layout.item_expand, viewGroup, false);
        return new PersonViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.bind(itemList.get(position), position);
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

}
