package com.example.tourgide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Custom_list extends ArrayAdapter<Resturent_Constructor> {


    public Custom_list(Activity context, ArrayList<Resturent_Constructor> name) {
        super(context, 0, name);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_list, parent, false);
        }

        Resturent_Constructor currentItem = getItem(position);

        TextView tvName = (TextView) listItemView.findViewById(R.id.name);
        tvName.setText(currentItem.getName());

        TextView tvDesc = (TextView) listItemView.findViewById(R.id.desc);
        tvDesc.setText(currentItem.getDesc());

        ImageView Image = (ImageView) listItemView.findViewById(R.id.img);
        Image.setImageDrawable(currentItem.getImage());

        return listItemView;
    }
}