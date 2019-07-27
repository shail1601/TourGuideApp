package com.example.android.tourapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.tourapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setElevation(0);

        ViewPager viewPager = (ViewPager) findViewById(R.id.category_view_pager);

        com.example.android.tourapp.CategoryViewPager categoryViewPager = new com.example.android.tourapp.CategoryViewPager(getSupportFragmentManager());

        viewPager.setAdapter(categoryViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);
    }
}
