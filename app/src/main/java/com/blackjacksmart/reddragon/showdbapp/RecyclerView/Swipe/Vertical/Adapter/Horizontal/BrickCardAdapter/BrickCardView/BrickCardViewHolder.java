package com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.Vertical.Adapter.Horizontal.BrickCardAdapter.BrickCardView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.blackjacksmart.reddragon.showdbapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by blackjack on 7/27/17.
 */

public class BrickCardViewHolder extends RecyclerView.ViewHolder{

    @Nullable @BindView(R.id.card_view_holder) CardView cardView;
    @Nullable @BindView (R.id.title_textview) TextView titleTextView;
    @Nullable @BindView (R.id.detail_textview) TextView detailTextView;


    public BrickCardViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        v.getContext(),
                        "Brick Card Position: " +getAdapterPosition(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void bind(){}

    public Context getContext(){ return titleTextView.getContext(); }

}


