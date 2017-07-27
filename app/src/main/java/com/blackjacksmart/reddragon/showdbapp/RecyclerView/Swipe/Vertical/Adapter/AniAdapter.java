package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.blackjacksmart.reddragon.showdbapp.R;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.AniCardAdapter.Top25Ani;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.AniCardAdapter.TopComedyAni;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.AniCardAdapter.TopHorrorAni;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.AniCardAdapter.TopRomanceAni;
import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.ViewHolder.AniChannelViewHolder;

/**
 * Created by RedDragon on 1/1/17.
 */

public class AniAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AniChannelViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ani_holder_layout, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int itemType = getItemViewType(position);

        switch(itemType) {

            case 0:

                Top25Ani top25AniAdapter = new Top25Ani();
                ((AniChannelViewHolder) holder).aniHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((AniChannelViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setAdapter(top25AniAdapter);
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                top25AniAdapter.notifyDataSetChanged();

                break;

            case 1:

                TopComedyAni topComedyAniAdapter = new TopComedyAni();
                ((AniChannelViewHolder) holder).aniHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((AniChannelViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setAdapter(topComedyAniAdapter);
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topComedyAniAdapter.notifyDataSetChanged();

                break;

            case 2:

                TopHorrorAni topHorrorAniAdapter = new TopHorrorAni();
                ((AniChannelViewHolder) holder).aniHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((AniChannelViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setAdapter(topHorrorAniAdapter);
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topHorrorAniAdapter.notifyDataSetChanged();

                break;

            case 3:

                TopRomanceAni topRomanceAniAdapter = new TopRomanceAni();
                ((AniChannelViewHolder) holder).aniHorizontalRecycler.setLayoutManager(
                        new LinearLayoutManager(((AniChannelViewHolder) holder).getContext(),
                                LinearLayoutManager.HORIZONTAL, false));
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setAdapter(topRomanceAniAdapter);
                ((AniChannelViewHolder) holder).aniHorizontalRecycler
                        .setNestedScrollingEnabled(false);
                topRomanceAniAdapter.notifyDataSetChanged();

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
