package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blackjacksmart.reddragon.showdbapp.R;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.BrickAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by blackjack on 7/19/17.
 */

public class BrickSwipeFragment extends Fragment {

    @BindView(R.id.vertical_recycler_view) RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.horizontal_slider, container, false);
        ButterKnife.bind(this, view);
        initiateBrickRecycler();
        return view;
    }

    private void initiateBrickRecycler(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new BrickAdapter());
    }
}


