package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import static com.blackjacksmart.reddragon.showdbapp.MainActivity.ANI_CHANNEL;
import static com.blackjacksmart.reddragon.showdbapp.MainActivity.BRICK_TV;
import static com.blackjacksmart.reddragon.showdbapp.MainActivity.MOVIE_HOMIE;
import static com.blackjacksmart.reddragon.showdbapp.MainActivity.swipeAdapter;

/**
 * Created by RedDragon on 12/31/16.
 */


public class SwipeAdapter extends FragmentPagerAdapter {
//--------------------------------------Main Constructor--------------------------------------------

    public SwipeAdapter(FragmentManager fm) { super(fm); }

//------------------------------------Override Methods----------------------------------------------

    @Override
    public Fragment getItem(int position) {
        System.out.println("get Item Position: " +position );


        if(position == (ANI_CHANNEL)){ return new AniSwipeFragment();}
        if(position == (BRICK_TV)){ return new BrickSwipeFragment();}
        if(position == (MOVIE_HOMIE)){ return new MovieSwipeFragment();}

        return new AniSwipeFragment();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        return super.instantiateItem(container, position);
    }

    @Override
    public int getCount() {
        return 3;
    }

//--------------------------------------------------------------------------------------------------

}

