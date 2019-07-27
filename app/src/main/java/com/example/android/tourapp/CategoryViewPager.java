package com.example.android.tourapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourapp.FitnessFragment;
import com.example.android.tourapp.FoodFragment;
import com.example.android.tourapp.FunFragment;
import com.example.android.tourapp.ParksFragment;


public class CategoryViewPager extends FragmentPagerAdapter {

    public CategoryViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParksFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new FunFragment();
            default:
                return new FitnessFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Parks";
            case 1:
                return "Food";
            case 2:
                return "Fun";
            default:
                return "Fitness";
        }
    }
}