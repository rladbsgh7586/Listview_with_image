package com.example.listview_with_image;

/**
 * Created by songmho on 2014-08-03.
 */
public class Listviewitem {
    private int icon;
    private String name;

    public int getIcon(){return icon;}
    public String getName(){return name;}

    public Listviewitem(int icon,String name){
        this.icon=icon;
        this.name=name;
    }
}
