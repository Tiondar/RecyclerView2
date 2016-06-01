package com.example.basil.recyclerview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        initializeData();

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);



        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.luigi));  //
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.mammut));  //
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.chiby_cthulhu));  //
    }
}
