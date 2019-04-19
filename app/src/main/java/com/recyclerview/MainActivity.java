package com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView =findViewById(R.id.recyclerView);

        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla","9842786954", R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan KC","9842786954", R.drawable.bhuwan));
        contactsList.add(new Contacts("Ritik Roshan","9842786954", R.drawable.ritik));
        contactsList.add(new Contacts("Nikhil Upreti","9842786954", R.drawable.nikhil));
        contactsList.add(new Contacts("Dahayang Rai","9842786954", R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat Malla","9842786954", R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan KC","9842786954", R.drawable.bhuwan));
        contactsList.add(new Contacts("Ritik Roshan","9842786954", R.drawable.ritik));
        contactsList.add(new Contacts("Nikhil Upreti","9842786954", R.drawable.nikhil));
        contactsList.add(new Contacts("Dahayang Rai","9842786954", R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat Malla","9842786954", R.drawable.saugat));
        contactsList.add(new Contacts("Bhuwan KC","9842786954", R.drawable.bhuwan));
        contactsList.add(new Contacts("Ritik Roshan","9842786954", R.drawable.ritik));
        contactsList.add(new Contacts("Nikhil Upreti","9842786954", R.drawable.nikhil));
        contactsList.add(new Contacts("Dahayang Rai","9842786954", R.drawable.dahayang));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        RecyclerView.setAdapter(contactsAdapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
