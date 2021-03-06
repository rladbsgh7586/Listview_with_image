package com.example.listview_with_image;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class ListviewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listView=(ListView)findViewById(R.id.listview);

        ArrayList<Listviewitem> data=new ArrayList<>();
        Listviewitem lion=new Listviewitem(R.drawable.lion,"Lion");
        Listviewitem tiger=new Listviewitem(R.drawable.tiger,"Tiger");
        Listviewitem dog=new Listviewitem(R.drawable.dog,"Dog");
        Listviewitem cat=new Listviewitem(R.drawable.cat,"Cat");

        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);

        ListviewAdapter adapter=new ListviewAdapter(this,R.layout.listviewitem,data);
        listView.setAdapter(adapter);
    }
}
