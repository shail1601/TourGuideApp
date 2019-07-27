package com.example.android.tourapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.tourapp.R;

import java.util.ArrayList;
import java.util.Objects;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity activity, ArrayList<Location> locations) {
        super(activity, 0, locations);
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View locationItemView = convertView;

        if (locationItemView == null) {
            locationItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        Location location = getItem(position);

        // Set location name
        TextView nameTextView = (TextView) locationItemView.findViewById(R.id.location_name);
        nameTextView.setText(location.getLocationName());

        // Set location price
        TextView addressTextView = (TextView) locationItemView.findViewById(R.id.location_text);
        addressTextView.setText(location.getLocationAddress());

        // Set Location hours or hide
        String hours = location.getLocationHours();
        TextView hoursTextView = (TextView) locationItemView.findViewById(R.id.hours_text);

        if (Objects.equals(hours, "n/a") || hours == null) {
            LinearLayout icon = (LinearLayout) locationItemView.findViewById(R.id.hours_layout);
            icon.setVisibility(View.GONE);
            hoursTextView.setVisibility(View.GONE);
        } else {
            hoursTextView.setText(hours);
        }

        // Set the phone number or hide
        TextView phoneTextView = (TextView) locationItemView.findViewById(R.id.phone_text);
        String phone = location.getPhoneNumber();

        if (Objects.equals(phone, "n/a") || phone == null) {
            LinearLayout phoneLayout = (LinearLayout) locationItemView.findViewById(R.id.phone_layout);
            phoneLayout.setVisibility(View.GONE);
            phoneTextView.setVisibility(View.GONE);
        } else {
            phoneTextView.setText(phone);
        }

        // Handle photo if applicable
        ImageView photo = (ImageView) locationItemView.findViewById(R.id.photo);

        if (location.hasImage()) {
            photo.setImageResource(location.getImageResourceId());
        } else {
            photo.setVisibility(View.GONE);
        }

        // Set the description
        TextView descriptionTextView = (TextView) locationItemView.findViewById(R.id.description_text);
        descriptionTextView.setText(location.getDescription());

        return locationItemView;
    }
}
