package com.blackjacksmart.reddragon.showdbapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.blackjacksmart.reddragon.showdbapp.RecyclerView.Swipe.SwipeAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity {

public static final int ANI_CHANNEL = 0, BRICK_TV = 1, MOVIE_HOMIE = 2;
public static SwipeAdapter swipeAdapter;
public static int positionClicked;
public static int swipePosition;
Bundle bundle;



//-----------------------------------Initiate Variables---------------------------------------------

@BindView(R.id.toolbar) Toolbar toolBar;
@BindView(R.id.view_pager) public ViewPager viewPager;
@BindView(R.id.button1) Button aniButton;
@BindView(R.id.button2) Button brickButton;
@BindView(R.id.button3) Button movieButton;


//---------------------------------------Life Cycle-------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initiateViewPager();

        initAniButtonClick();
        initBrickButtonClick();
        initMovieButtonClick();


    }

    @Override
    protected void onResume() {
        super.onResume();

    }

//------------------------------------Button CLick Listener-----------------------------------------

    private void initAniButtonClick(){
        aniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipePosition = ANI_CHANNEL;
                viewPager.setCurrentItem(swipePosition);
            }
        });
    }

    private void initBrickButtonClick(){
        brickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipePosition = BRICK_TV;
                viewPager.setCurrentItem(swipePosition);
            }});
    }

    private void initMovieButtonClick(){
        movieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipePosition = MOVIE_HOMIE;
                viewPager.setCurrentItem(swipePosition);
            }
        });
    }

//----------------------------------------Page Slider-----------------------------------------------

    private void initiateViewPager(){
        viewPager.setVisibility(View.GONE);
        swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
                viewPager.setAdapter(swipeAdapter);
                viewPager.setCurrentItem(ANI_CHANNEL);
                viewPager.setOffscreenPageLimit(0);
                viewPager.setVisibility(View.VISIBLE);
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        System.out.println(" position: " +position + "positionOffset: " +positionOffset+ "positionPix: " +positionOffsetPixels);
                        swipePosition = position;
                        swipeAdapter.getItem(swipePosition);

                    }

                    @Override
                    public void onPageSelected(int position) {
                      //      System.out.println(" position onPageSelected: " +position);

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {
                    //    System.out.println(" on page state change: " +state);
                    //    swipePosition = state;
                    //    swipeAdapter.getItem(state);

                    }
                });
    }

//--------------------------------------------------------------------------------------------------

    public MainActivity() {}

    public ViewPager getViewPager(){ return viewPager; }

//-----------------------------------------Retrofit-------------------------------------------------

//    public void getTopStoriesClient() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(token.NEW_YORK_TIMES_TOPSTORY_BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        NYTimesService nyTimesService = retrofit.create(NYTimesService.class);
//        Call<NYTopStoriesPOJO> getRecentMedia = nyTimesService.getTopStories();
//
//        getRecentMedia.enqueue(new Callback<NYTopStoriesPOJO>() {
//            @Override
//            public void onResponse(Call<NYTopStoriesPOJO> call, Response<NYTopStoriesPOJO> response) {
//                if (response.isSuccessful()) {
//                    NYTopStoriesPOJO NYTTopStories = response.body();
//                    List<NYTopStoriesPOJO.Results> results = NYTTopStories.getResults();
//
//                    for (int i = 0; i<results.size(); i++) {
//                        nyTimesData.add(results.get(i));
//                        headerData.add(response.body().getLast_updated());
//                        uriData.add(response.body().getResults().get(i).getUrl());
//                    }
//
//                    initiateRecyclerView();
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<NYTopStoriesPOJO> call, Throwable t) {
//                Log.d("call:fail ", "retrofit fail: " + t.toString());
//            }
//        });}

//--------------------------------------------------------------------------------------------------

}
