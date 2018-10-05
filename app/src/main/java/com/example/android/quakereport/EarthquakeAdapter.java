package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter {

    //private static final String LOG_TAG = EarthquakeActivity.class.getName();

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        // return super.getView(position, convertView, parent);

        // Check to inflate the view
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake;
        currentEarthquake = (Earthquake) getItem(position);


        TextView magnitudeView = listView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthquake.getMagnitude());

        TextView locationView = listView.findViewById(R.id.location);
        locationView.setText(currentEarthquake.getLocation());

        TextView dateView = listView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getDate());

        return listView;
    }
}