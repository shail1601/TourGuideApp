package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourapp.LocationAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;


public class FitnessFragment extends Fragment {

    public FitnessFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.goodlife_name),
                getString(R.string.goodlife_address),
                getString(R.string.goodlife_hours),
                getString(R.string.goodlife_phone),
                getString(R.string.goodlife_description),
                R.drawable.goodlife_fitness));

        locations.add(new Location(getString(R.string.stadium_name),
                getString(R.string.stadium_address),
                getString(R.string.not_applicable),
                getString(R.string.stadium_phone),
                getString(R.string.stadium_description),
                R.drawable.monarch_stadium));

        locations.add(new Location(getString(R.string.oneseven_name),
                getString(R.string.oneseven_address),
                getString(R.string.oneseven_hours),
                getString(R.string.oneseven_phone),
                getString(R.string.oneseven_description),
                R.drawable.oneseven_sports));

        locations.add(new Location(getString(R.string.crossfittoronto_name),
                getString(R.string.crossfittoronto_address),
                getString(R.string.crossfittoronto_hours),
                getString(R.string.crossfittoronto_phone),
                getString(R.string.crossfittoronto_description),
                R.drawable.cross_fit));

        locations.add(new Location(getString(R.string.planetfitness_name),
                getString(R.string.planetfitness_address),
                getString(R.string.planetfitness_hours),
                getString(R.string.planetfitness_phone),
                getString(R.string.planetfitness_description),
                R.drawable.planet_fitness));

        locations.add(new Location(getString(R.string.gymnastics_name),
                getString(R.string.gymnastics_address),
                getString(R.string.gymnastics_hours),
                getString(R.string.gymnastics_phone),
                getString(R.string.gymnastics_description),
                R.drawable.gymnastics_club));

        locations.add(new Location(getString(R.string.pool_name),
                getString(R.string.pool_address),
                getString(R.string.pool_name),
                getString(R.string.pool_phone),
                getString(R.string.pool_description),
                R.drawable.albion_pool));

        locations.add(new Location(getString(R.string.yoga_name),
                getString(R.string.yoga_address),
                getString(R.string.yoga_hours),
                getString(R.string.yoga_phone),
                getString(R.string.yoga_description),
                R.drawable.power_yoga_canada));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
