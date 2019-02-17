package com.example.tourgide;

import android.graphics.drawable.Drawable;

public class Resturent_Constructor {

    private String name;
    private String desc;
    private Drawable image;


    public Resturent_Constructor(String Name, String Desc, Drawable Image){
        name = Name;
        desc = Desc;
        image = Image;
    }

    public String getName()
    {
        return name;
    }
    public String getDesc()
    {
        return desc;
    }
    public Drawable getImage()
    {
        return image;
    }
}
