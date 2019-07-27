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


public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.boston_pizza_name),
                getString(R.string.boston_pizza_address),
                getString(R.string.boston_pizza_hours),
                getString(R.string.boston_pizza_phone),
                getString(R.string.boston_pizza_description),
                R.drawable.boston_pizza));

        locations.add(new Location(getString(R.string.mandarin_name),
                getString(R.string.mandarin_address),
                getString(R.string.mandarin_hours),
                getString(R.string.mandarin_phone),
                getString(R.string.mandarin_description),
                R.drawable.mandarin_restaurant));

        locations.add(new Location(getString(R.string.spring_sushi_name),
                getString(R.string.spring_sushi_address),
                getString(R.string.spring_sushi_hours),
                getString(R.string.spring_sushi_phone),
                getString(R.string.spring_sushi_description),
                R.drawable.spring_sushi));

        locations.add(new Location(getString(R.string.stelvio_name),
                getString(R.string.stelvio_address),
                getString(R.string.stelvio_hours),
                getString(R.string.stelvio_phone),
                getString(R.string.stelvio_description),
                R.drawable.stelvio));

        locations.add(new Location(getString(R.string.jack_name),
                getString(R.string.jack_address),
                getString(R.string.jack_hours),
                getString(R.string.jack_phone),
                getString(R.string.jack_description),
                R.drawable.jack));

        locations.add(new Location(getString(R.string.demetres_name),
                getString(R.string.demetres_address),
                getString(R.string.demetres_hours),
                getString(R.string.demetres_phone),
                getString(R.string.demetres_description),
                R.drawable.demetres));

        locations.add(new Location(getString(R.string.Tim_Horton_name),
                getString(R.string.Tim_Horton_address),
                getString(R.string.Time_Horton_hours),
                getString(R.string.Tim_Horton_phone),
                getString(R.string.Tim_Horton_description),
                R.drawable.tim_hortons));

        locations.add(new Location(getString(R.string.brar_name),
                getString(R.string.brar_address),
                getString(R.string.brar_hours),
                getString(R.string.brar_phone),
                getString(R.string.brar_description),
                R.drawable.brar));

        locations.add(new Location(getString(R.string.starbucks_name),
                getString(R.string.starbucks_address),
                getString(R.string.starbucks_hours),
                getString(R.string.starbucks_phone),
                getString(R.string.starbucks_description),
                R.drawable.starbucks));

        locations.add(new Location(getString(R.string.catrin_name),
                getString(R.string.catrin_address),
                getString(R.string.catrin_hours),
                getString(R.string.catrin_phone),
                getString(R.string.catrin_description),
                R.drawable.catrin));

        locations.add(new Location(getString(R.string.amsterdam_brewhouse_name),
                getString(R.string.amsterdam_brewhouse_address),
                getString(R.string.amsterdam_brewhouse_hours),
                getString(R.string.amsterdam_brewhouse_phone),
                getString(R.string.amsterdam_brewhouse_description),
                R.drawable.amsterdam));

        locations.add(new Location(getString(R.string.moxie_name),
                getString(R.string.moxie_address),
                getString(R.string.moxie_hours),
                getString(R.string.moxie_phone),
                getString(R.string.moxie_description),
                R.drawable.moxie));

        locations.add(new Location(getString(R.string.cheesecake_name),
                getString(R.string.cheesecake_address),
                getString(R.string.cheesecake_hours),
                getString(R.string.cheesecake_phone),
                getString(R.string.cheesecake_description),
                R.drawable.cheesecake));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
