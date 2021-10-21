package com.example.InstaSaver;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
            return new photo_fragment();

            case 1:
                return new video_fragment();

            case 2:
                return new reel_fragment();

            case 3:
                return new igtv_fragment();

            case 4:
                return new dp_fragment();

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
