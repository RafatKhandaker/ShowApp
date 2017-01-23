package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.blackjacksmart.reddragon.showdbapp.R;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.BrickCardAdapter.Top25BrickTv;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.BrickCardAdapter.TopComedyBrickTv;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.BrickCardAdapter.TopHorrorBrickTv;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.BrickCardAdapter.TopRomanceBrickTv;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.ViewHolder.BrickTVViewHolder;

/**
 * Created by RedDragon on 1/1/17.
 */

public class BrickAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BrickTVViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.brick_horizontal_recycler, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int itemType = getItemViewType(position);

        switch(itemType) {

            case 0:

                Top25BrickTv top25BrickAdapter = new Top25BrickTv();
                ((BrickTVViewHolder) holder).brickHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((BrickTVViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setAdapter(top25BrickAdapter);
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                top25BrickAdapter.notifyDataSetChanged();

                break;

            case 1:

                TopComedyBrickTv topComedyBrickAdapter = new TopComedyBrickTv();
                ((BrickTVViewHolder) holder).brickHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((BrickTVViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setAdapter(topComedyBrickAdapter);
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topComedyBrickAdapter.notifyDataSetChanged();

                break;

            case 2:

                TopHorrorBrickTv topHorrorBrickAdapter = new TopHorrorBrickTv();
                ((BrickTVViewHolder) holder).brickHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((BrickTVViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setAdapter(topHorrorBrickAdapter);
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topHorrorBrickAdapter.notifyDataSetChanged();

                break;

            case 3:

                TopRomanceBrickTv topRomanceBrickAdapter = new TopRomanceBrickTv();
                ((BrickTVViewHolder) holder).brickHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((BrickTVViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setAdapter(topRomanceBrickAdapter);
                ((BrickTVViewHolder) holder).brickHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topRomanceBrickAdapter.notifyDataSetChanged();

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
