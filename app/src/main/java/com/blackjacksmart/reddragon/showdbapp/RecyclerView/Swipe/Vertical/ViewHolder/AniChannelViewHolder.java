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

    private int vAdapterPosition;

    public AniChannelViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                positionClicked = ANI_CHANNEL;
                vAdapterPosition = getAdapterPosition() +1;

                Snackbar.make(v,"Ani-Channel position " +vAdapterPosition,
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                // -------- LAUNCH FRAGMENT ACTIVITY ------------- //

            }
        });
    }

    public void bind(){
        detailsTextView.setText("Ani Channel" +getAdapterPosition());
    }

    public Context getContext(){ return aniHorizontalRecycler.getContext(); }

    public int getVPosition(){ return vAdapterPosition; }

}
