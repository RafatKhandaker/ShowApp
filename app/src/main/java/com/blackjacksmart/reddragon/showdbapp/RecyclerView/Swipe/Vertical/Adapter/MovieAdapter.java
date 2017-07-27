package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.blackjacksmart.reddragon.showdbapp.R;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.MovieCardAdapter.Top25Movie;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.MovieCardAdapter.TopComedyMovie;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.MovieCardAdapter.TopHorrorMovie;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.MovieCardAdapter.TopRomanceMovie;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.ViewHolder.MovieHomieViewHolder;

/**
 * Created by RedDragon on 1/1/17.
 */

public class MovieAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MovieHomieViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_holder_layout, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int itemType = getItemViewType(position);

        switch(itemType) {

            case 0:

                Top25Movie top25MovieAdapter = new Top25Movie();
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((MovieHomieViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setAdapter(top25MovieAdapter);
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                top25MovieAdapter.notifyDataSetChanged();

                break;

            case 1:

                TopComedyMovie topComedyMovieAdapter = new TopComedyMovie();
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((MovieHomieViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setAdapter(topComedyMovieAdapter);
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topComedyMovieAdapter.notifyDataSetChanged();

                break;

            case 2:

                TopHorrorMovie topHorrorMovieAdapter = new TopHorrorMovie();
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((MovieHomieViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setAdapter(topHorrorMovieAdapter);
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topHorrorMovieAdapter.notifyDataSetChanged();

                break;

            case 3:

                TopRomanceMovie topRomanceMovieAdapter = new TopRomanceMovie();
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((MovieHomieViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setAdapter(topRomanceMovieAdapter);
                ((MovieHomieViewHolder) holder).movieHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topRomanceMovieAdapter.notifyDataSetChanged();

                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch(position){
            case 0: return 0;

            case 1: return 1;

            case 2: return 2;

            case 3: return 3;
        }
        return -1;
    }


    @Override
    public int getItemCount() { return 4; }
}
