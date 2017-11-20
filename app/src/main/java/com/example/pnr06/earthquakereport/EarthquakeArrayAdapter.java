package com.example.pnr06.earthquakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PNR06 on 11/19/2017.
 */

class EarthquakeArrayAdapter extends ArrayAdapter<EarthquakeDataObject> {

    Context mContext;
    int mResouce;

    public EarthquakeArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EarthquakeDataObject> objects) {
        super(context, resource, objects);
        mContext = context;
        mResouce = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String mag = getItem(position).getMag();
        String loc = getItem(position).getLoc();
        String time = getItem(position).getTime();

        EarthquakeDataObject earthquakeDataObject = new EarthquakeDataObject(mag, loc, time);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResouce, parent, false);

        TextView tvMag = convertView.findViewById(R.id.magTextView);
        TextView tvLoc = convertView.findViewById(R.id.locTextView);
        TextView tvTime = convertView.findViewById(R.id.timeTextView);

        tvMag.setText(mag);
        tvLoc.setText(loc);
        tvTime.setText(time);

        return convertView;

    }
}
