package com.example.lenovo.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Context context, int resources, List<Info> infoList) {
        super(context, resources, infoList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Info currentInfo = getItem(position);
        View infoItemView = convertView;

        if (infoItemView == null) {
            infoItemView = LayoutInflater.from(getContext()).inflate(R.layout.info_item, parent, false);
        }

        TextView nameInfoTextView = infoItemView.findViewById(R.id.nameTextView);
        nameInfoTextView.setText(currentInfo.getName());

        TextView descriptionLocationTextView = infoItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentInfo.getDescription());

        ImageView infoImageView = infoItemView.findViewById(R.id.photoImageView);
        infoImageView.setImageResource(currentInfo.getImageResourceId());

        return infoItemView;
    }
}

