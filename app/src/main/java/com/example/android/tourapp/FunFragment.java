package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.nathan_name),
                getString(R.string.nathan_address),
                getString(R.string.nathan_hours),
                getString(R.string.not_applicable),
                getString(R.string.nathan_description),
                R.drawable.nathan_phillips_square));

        locations.add(new Location(getString(R.string.aquarium_name),
                getString(R.string.aquarium_address),
                getString(R.string.aquarium_hours),
                getString(R.string.aquarium_phone),
                getString(R.string.aquarium_description),
                R.drawable.ripleys_aquarium));

        locations.add(new Location(getString(R.string.trampoline_name),
                getString(R.string.trampoline_address),
                getString(R.string.trampoline_hours),
                getString(R.string.trampoline_phone),
                getString(R.string.trampoline_description),
                R.drawable.trampoline_park));

        locations.add(new Location(getString(R.string.centre_name),
                getString(R.string.centre_address),
                getString(R.string.not_applicable),
                getString(R.string.centre_phone),
                getString(R.string.centre_description),
                R.drawable.rogers_centre));

        locations.add(new Location(getString(R.string.eaton_name),
                getString(R.string.eaton_address),
                getString(R.string.eaton_hours),
                getString(R.string.eaton_phone),
                getString(R.string.eaton_description),
                R.drawable.eaton_centre));

        locations.add(new Location(getString(R.string.wonderland_name),
                getString(R.string.wonderland_address),
                getString(R.string.wonderland_hours),
                getString(R.string.wonderland_phone),
                getString(R.string.wonderland_description),
                R.drawable.wonderland));

        locations.add(new Location(getString(R.string.square_name),
                getString(R.string.square_address),
                getString(R.string.square_hours),
                getString(R.string.square_phone),
                getString(R.string.square_description),
                R.drawable.yonge_dundas_square));

        locations.add(new Location(getString(R.string.tower_name),
                getString(R.string.tower_address),
                getString(R.string.tower_hours),
                getString(R.string.tower_phone),
                getString(R.string.tower_description),
                R.drawable.edge_walk));

        locations.add(new Location(getString(R.string.garden_name),
                getString(R.string.garden_address),
                getString(R.string.garden_hours),
                getString(R.string.garden_phone),
                getString(R.string.garden_description),
                R.drawable.edwards_gardens));

        locations.add(new Location(getString(R.string.market_name),
                getString(R.string.market_address),
                getString(R.string.market_hours),
                getString(R.string.market_phone),
                getString(R.string.market_description),
                R.drawable.the_christmas_market));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
