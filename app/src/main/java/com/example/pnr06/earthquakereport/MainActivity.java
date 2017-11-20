package com.example.pnr06.earthquakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView earthquakeListView = findViewById(R.id.quakeListView);

        ArrayList<EarthquakeDataObject> earthquakeDataObjectArrayList = new ArrayList<>();

        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));
        earthquakeDataObjectArrayList.add(new EarthquakeDataObject("5.2", "Spain", "12-06-1981 12:20 pm"));

        EarthquakeArrayAdapter earthquakeArrayAdapter = new EarthquakeArrayAdapter(this, R.layout.item_row_list_view,earthquakeDataObjectArrayList);

        earthquakeListView.setAdapter(earthquakeArrayAdapter);


    }
}
