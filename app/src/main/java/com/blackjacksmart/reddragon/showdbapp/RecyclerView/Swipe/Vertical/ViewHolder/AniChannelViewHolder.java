package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.ViewHolder;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.blackjacksmart.reddragon.showdbapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.blackjacksmart.reddragon.showdbapp.MainActivity.ANI_CHANNEL;
import static com.blackjacksmart.reddragon.showdbapp.MainActivity.positionClicked;

/**
 * Created by RedDragon on 12/29/16.
 */

public class AniChannelViewHolder extends RecyclerView.ViewHolder {

@Nullable @BindView(R.id.detail_textview) TextView detailsTextView;
@Nullable @BindView(R.id.ani_horizontal_recycler) public RecyclerView aniHorizontalRecycler;

    private int horizontalAdapterPosition;

    public AniChannelViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                positionClicked = ANI_CHANNEL;
                horizontalAdapterPosition = getAdapterPosition() +1;

                Snackbar.make(v,"Ani-Channel position " +horizontalAdapterPosition,
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                // -------- LAUNCH FRAGMENT ACTIVITY ------------- //

            }
        });
    }

    public void bind(){
        detailsTextView.setText("Ani Channel");
    }

    public Context getContext(){ return aniHorizontalRecycler.getContext(); }


}
