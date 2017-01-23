package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blackjacksmart.reddragon.showdbapp.R;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.AniAdapter;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.BrickAdapter;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.MovieAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.blackjacksmart.reddragon.showdbapp.MainActivity.ANI_CHANNEL;
import static com.blackjacksmart.reddragon.showdbapp.MainActivity.BRICK_TV;
import static com.blackjacksmart.reddragon.showdbapp.MainActivity.MOVIE_HOMIE;
import static com.blackjacksmart.reddragon.showdbapp.MainActivity.bundle;

/**
 * Created by RedDragon on 12/31/16.
 */

public class HorizontalSwipeFragment extends Fragment {

@BindView(R.id.vertical_recycler_view) public RecyclerView recyclerView;

    public HorizontalSwipeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.horizontal_slider, container, false);
        ButterKnife.bind(this, view);

        System.out.println(bundle.getInt("count"));
            switch(bundle.getInt("count")){

                case ANI_CHANNEL:
                    initiateAniRecycler();
                    break;
                case BRICK_TV:
                    initiateBrickRecycler();
                    break;
                case MOVIE_HOMIE:
                    initiateMovieRecycler();
                    break;
                default:
                    initiateAniRecycler();
                    break;
            }

        return view;
    }

    private void initiateAniRecycler() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new AniAdapter());
    }

    private void initiateBrickRecycler(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new BrickAdapter());
    }

    private void initiateMovieRecycler(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MovieAdapter());
    }

}
