package com.example.myapplication.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       try{
           Fragment fragment = new Fragment();
        switch (position){

            case 0:
                fragment = RelativeLayout.newInstance("hi","why");
                break;
            case 1:
                fragment = ConstraintLayout.newInstance("hi","why");
                break;
            case 2:
                fragment = FrameLayout.newInstance("hi","why");
                break;
            case 3:
                fragment = LinearLayout.newInstance("hi","why");
                break;

        }
           return fragment;
       }
       catch(Exception e){

           System.out.println("crashed here");
        }
       return null;
     //return PlaceholderFragment.newInstance(position+1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}