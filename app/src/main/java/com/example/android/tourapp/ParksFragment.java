package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Add all of the Park locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.high_park_name),
                getString(R.string.high_park_address),
                getString(R.string.high_park_hours),
                getString(R.string.high_park_phone),
                getString(R.string.high_park_description),
                R.drawable.high_park));

        locations.add(new Location(getString(R.string.dufferin_grove_park_name),
                getString(R.string.dufferin_grove_park_address),
                getString(R.string.dufferin_grove_park_hours),
                getString(R.string.dufferin_grove_park_phone),
                getString(R.string.dufferin_grove_park_description),
                R.drawable.dufferin_grove_park));

        locations.add(new Location(getString(R.string.sunnybrook_park_name),
                getString(R.string.sunnybrook_park_address),
                getString(R.string.sunnybrook_park_hours),
                getString(R.string.sunnybrook_park_phone),
                getString(R.string.sunnybrook_park_description),
                R.drawable.sunnybrook_park));

        locations.add(new Location(getString(R.string.oriole_park_name),
                getString(R.string.oriole_park_address),
                getString(R.string.oriole_park_hours),
                getString(R.string.oriole_park_phone),
                getString(R.string.oriole_park_description),
                R.drawable.oriole_park));

        locations.add(new Location(getString(R.string.grange_park_name),
                getString(R.string.grange_park_address),
                getString(R.string.grange_park_hours),
                getString(R.string.grange_park_phone),
                getString(R.string.grange_park_description),
                R.drawable.grange_park));

        locations.add(new Location(getString(R.string.berczy_park_name),
                getString(R.string.berczy_park_address),
                getString(R.string.berczy_park_hours),
                getString(R.string.berczy_park_phone),
                getString(R.string.berczy_park_description),
                R.drawable.berczy_park));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
