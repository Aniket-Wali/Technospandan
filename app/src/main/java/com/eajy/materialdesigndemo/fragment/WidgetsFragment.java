package com.eajy.materialdesigndemo.fragment;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.eajy.materialdesigndemo.R;
import com.eajy.materialdesigndemo.activity.*;


public class WidgetsFragment extends Fragment implements View.OnClickListener, View.OnTouchListener{



    private ImageView img_view_1,img_view_2,img_view_3,img_view_4,img_view_5,img_view_6,
            img_view_8,img_view_7;
    private CardView card_view_1,card_view_2,card_view_3,card_view_4,card_view_5,card_view_6,
            card_view_7,card_view_8;
    private AlphaAnimation alphaAnimation, alphaAnimationShowIcon;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_widgets, container, false);



        img_view_1 = nestedScrollView.findViewById(R.id.ss1);
        img_view_2 = nestedScrollView.findViewById(R.id.ss2);
        img_view_3 = nestedScrollView.findViewById(R.id.ss3);
        img_view_5 = nestedScrollView.findViewById(R.id.ss5);
        img_view_6 = nestedScrollView.findViewById(R.id.ss6);
        img_view_7 = nestedScrollView.findViewById(R.id.ss7);
        img_view_8 = nestedScrollView.findViewById(R.id.ss8);
       





        card_view_1 = nestedScrollView.findViewById(R.id.sport1);
        card_view_2 = nestedScrollView.findViewById(R.id.sport2);
        card_view_3 = nestedScrollView.findViewById(R.id.sport3);
        card_view_5 = nestedScrollView.findViewById(R.id.sport5);
        card_view_6 = nestedScrollView.findViewById(R.id.sport6);
        card_view_7 = nestedScrollView.findViewById(R.id.sport7);
        card_view_8 = nestedScrollView.findViewById(R.id.sport8);
       






        Glide.with(getContext()).load(R.drawable.chess ).apply(new RequestOptions().fitCenter()).into(img_view_1);
        Glide.with(getContext()).load(R.drawable.marathon).apply(new RequestOptions().fitCenter()).into(img_view_2);
        Glide.with(getContext()).load(R.drawable.soccer).apply(new RequestOptions().fitCenter()).into(img_view_3);
        Glide.with(getContext()).load(R.drawable.badminton).apply(new RequestOptions().fitCenter()).into(img_view_5);
        Glide.with(getContext()).load(R.drawable.basketball).apply(new RequestOptions().fitCenter()).into(img_view_6);
        Glide.with(getContext()).load(R.drawable.lan_gaming).apply(new RequestOptions().fitCenter()).into(img_view_7);
        Glide.with(getContext()).load(R.drawable.archery).apply(new RequestOptions().fitCenter()).into(img_view_8);





        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        card_view_1.setOnClickListener(this);
        card_view_2.setOnClickListener(this);
        card_view_3.setOnClickListener(this);
        card_view_5.setOnClickListener(this);
        card_view_6.setOnClickListener(this);
        card_view_7.setOnClickListener(this);
        card_view_8.setOnClickListener(this);
      





        card_view_1.setOnTouchListener(this);
        card_view_2.setOnTouchListener(this);
        card_view_3.setOnTouchListener(this);
        card_view_5.setOnTouchListener(this);
        card_view_6.setOnTouchListener(this);
        card_view_7.setOnTouchListener(this);
        card_view_8.setOnTouchListener(this);
        





        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(700);
        img_view_1.startAnimation(alphaAnimation);


        alphaAnimationShowIcon = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimationShowIcon.setDuration(500);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.sport1:
                intent.setClass(getActivity(),Checkmate.class);
                startActivity(intent);
                break;
            case R.id.sport2:
                intent.setClass(getActivity(),marathon.class);
                startActivity(intent);
                break;
            case R.id.sport3:
                intent.setClass(getActivity(),Soccer.class);
                startActivity(intent);
                break;

            case R.id.sport5:
                intent.setClass(getActivity(),Badminton.class);
                startActivity(intent);
                break;
            case R.id.sport6:
                intent.setClass(getActivity(),Basketball.class);
                startActivity(intent);
                break;
            case R.id.sport7:
                intent.setClass(getActivity(),LanGaming.class);
                startActivity(intent);
                break;
            case R.id.sport8:
                intent.setClass(getActivity(),Archery.class);
                startActivity(intent);
                break;


        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                ObjectAnimator upAnim = ObjectAnimator.ofFloat(view, "translationZ", 16);
                upAnim.setDuration(150);
                upAnim.setInterpolator(new DecelerateInterpolator());
                upAnim.start();
                break;

            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                ObjectAnimator downAnim = ObjectAnimator.ofFloat(view, "translationZ", 0);
                downAnim.setDuration(150);
                downAnim.setInterpolator(new AccelerateInterpolator());
                downAnim.start();
                break;
        }
        return false;
    }



}
