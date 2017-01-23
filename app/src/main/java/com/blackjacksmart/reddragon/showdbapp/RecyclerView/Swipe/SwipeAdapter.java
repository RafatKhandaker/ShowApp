package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import static com.blackjacksmart.reddragon.showdbapp.MainActivity.bundle;

/**
 * Created by RedDragon on 12/31/16.
 */

public class SwipeAdapter extends FragmentPagerAdapter {

//--------------------------------------Main Constructor--------------------------------------------

    public SwipeAdapter(FragmentManager fm) { super(fm); }

//------------------------------------Override Methods----------------------------------------------

    @Override
    public Fragment getItem(int position) {
        return new HorizontalSwipeFragment();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        bundle = new Bundle();
        bundle.putInt("count", position);
        return super.instantiateItem(container, position);
    }

    @Override
    public int getCount() {
        return 3;
    }

//--------------------------------------------------------------------------------------------------

}

