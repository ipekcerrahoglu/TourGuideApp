package com.example.lenovo.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AntiphellosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<Info> arrayList = new ArrayList();
        arrayList.add(new Info(
                getContext().getString(R.string.antiphellos_name),
                getContext().getString(R.string.antiphellos_description),
                R.drawable.antiphellos_image
        ));
        InfoAdapter adapter = new InfoAdapter(getContext(), R.layout.info_list, arrayList);

        View view = inflater.inflate(R.layout.info_list, container, false);

        ListView listView = view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return view;
    }
}