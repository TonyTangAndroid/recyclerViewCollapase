package com.codixlab.collapsingrecyclerview.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.codixlab.collapsingrecyclerview.R;
import com.codixlab.collapsingrecyclerview.adapter.PersonalAdapter;
import com.codixlab.collapsingrecyclerview.model.PersonModel;
import com.codixlab.collapsingrecyclerview.util.Data;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    PersonalAdapter adapter;
    List<PersonModel> personList;
    private RecyclerView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        init();
    }
    private void init() {
        personList = new ArrayList<>();
        personList.addAll(Data.getPersonsData(this));
        adapter = new PersonalAdapter(this, personList);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setHasFixedSize(true);
        list.setAdapter(adapter);


    }
}
