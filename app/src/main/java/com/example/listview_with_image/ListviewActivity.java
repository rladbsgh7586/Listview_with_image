package com.example.listview_with_image;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewActivity extends Activity {
    private ArrayList<Listviewitem> data=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listView=(ListView)findViewById(R.id.listview);

        data=new ArrayList<Listviewitem>();
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
