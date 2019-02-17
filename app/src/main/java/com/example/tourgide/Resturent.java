package com.example.tourgide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Resturent extends Fragment {

    ListView lst;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.resturent, container, false);

        final ArrayList<Resturent_Constructor> attractions = new ArrayList<>();
        final String[] Names = getResources().getStringArray(R.array.list_names);
        final String[] Desc = getResources().getStringArray(R.array.list_Desc);

        final TypedArray Images = getResources().obtainTypedArray(R.array.list_Image);
        for  (int id = 0; id != Names.length; ++id) {
            Resturent_Constructor newData = new Resturent_Constructor(Names[id],Desc[id],Images.getDrawable(id));
            attractions.add(newData);
        }

        Custom_list adapter = new Custom_list(getActivity(), attractions);

       lst = (ListView) rootView.findViewById(R.id.lst1);

        lst.setAdapter(adapter);

        return rootView;
    }






}
