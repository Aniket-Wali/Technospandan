package com.eajy.materialdesigndemo.fragment;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.eajy.materialdesigndemo.R;
import com.eajy.materialdesigndemo.activity.AirStrike;
import com.eajy.materialdesigndemo.activity.AppAthon;
import com.eajy.materialdesigndemo.activity.Chemwizz;
import com.eajy.materialdesigndemo.activity.Codetrex;
import com.eajy.materialdesigndemo.activity.CrackCat;
import com.eajy.materialdesigndemo.activity.Crypto;
import com.eajy.materialdesigndemo.activity.Electrade;
import com.eajy.materialdesigndemo.activity.Electromatrix;
import com.eajy.materialdesigndemo.activity.Fumes;
import com.eajy.materialdesigndemo.activity.Hitz;
import com.eajy.materialdesigndemo.activity.Junkyard;
import com.eajy.materialdesigndemo.activity.LFR;
import com.eajy.materialdesigndemo.activity.Nirmaan;
import com.eajy.materialdesigndemo.activity.PlayWithCodes;
import com.eajy.materialdesigndemo.activity.Quizomania;
import com.eajy.materialdesigndemo.activity.Roborace;
import com.eajy.materialdesigndemo.activity.RuleTheSky;
import com.eajy.materialdesigndemo.activity.ScrollingActivity;
import com.eajy.materialdesigndemo.activity.StartUp;
import com.eajy.materialdesigndemo.activity.TheRoboNight;
import com.eajy.materialdesigndemo.activity.tatva;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.content.Context.MODE_PRIVATE;

public class CardsFragment extends Fragment implements View.OnClickListener, View.OnTouchListener {



    private ImageView img_main_card_1,img_main_card_2,img_main_card_3,img_main_card_4,img_main_card_4_2,img_main_card_5,img_main_card_6,
            img_main_card_8,img_main_card_9,img_main_card_10,img_main_card_11,img_main_card_12,img_main_card_13,
            img_main_card_14,img_main_card_15,img_main_card_16,img_main_card_17,img_main_card_18,img_main_card_19,img_main_card_7;
    private CardView card_main_1_1,card_main_1_2,card_main_1_3,card_main_1_4,card_main_1_4_2,card_main_1_5,card_main_1_6,
    card_main_1_7,card_main_1_8,card_main_1_9,card_main_1_10,card_main_1_11,card_main_1_12,card_main_1_13,card_main_1_14,card_main_1_15,card_main_1_16,card_main_1_17,card_main_1_18,card_main_1_19;
    private AlphaAnimation alphaAnimation, alphaAnimationShowIcon;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_cards, container, false);



        img_main_card_1 = nestedScrollView.findViewById(R.id.img_main_card_1);
        img_main_card_2 = nestedScrollView.findViewById(R.id.img_main_card_2);
        img_main_card_3 = nestedScrollView.findViewById(R.id.img_main_card_3);
        img_main_card_4 = nestedScrollView.findViewById(R.id.img_main_card_4);
        img_main_card_4_2 = nestedScrollView.findViewById(R.id.img_main_card_4_2);
        img_main_card_5 = nestedScrollView.findViewById(R.id.img_main_card_5);
        img_main_card_6 = nestedScrollView.findViewById(R.id.img_main_card_6);
        img_main_card_7 = nestedScrollView.findViewById(R.id.img_main_card_7);
        img_main_card_8 = nestedScrollView.findViewById(R.id.img_main_card_8);
        img_main_card_9 = nestedScrollView.findViewById(R.id.img_main_card_9);
        img_main_card_10 = nestedScrollView.findViewById(R.id.img_main_card_10);
        img_main_card_11 = nestedScrollView.findViewById(R.id.img_main_card_11);
        img_main_card_12 = nestedScrollView.findViewById(R.id.img_main_card_12);
        img_main_card_13 = nestedScrollView.findViewById(R.id.img_main_card_13);
        img_main_card_14 = nestedScrollView.findViewById(R.id.img_main_card_14);
        img_main_card_15 = nestedScrollView.findViewById(R.id.img_main_card_15);
        img_main_card_16 = nestedScrollView.findViewById(R.id.img_main_card_16);
        img_main_card_17 = nestedScrollView.findViewById(R.id.img_main_card_17);
        img_main_card_18 = nestedScrollView.findViewById(R.id.img_main_card_18);
        img_main_card_19 = nestedScrollView.findViewById(R.id.img_main_card_19);





        card_main_1_1 = nestedScrollView.findViewById(R.id.card_main_1_1);
        card_main_1_2 = nestedScrollView.findViewById(R.id.card_main_1_2);
        card_main_1_3 = nestedScrollView.findViewById(R.id.card_main_1_3);
        card_main_1_4 = nestedScrollView.findViewById(R.id.card_main_1_4);
        card_main_1_4_2 = nestedScrollView.findViewById(R.id.card_main_1_4_2);
        card_main_1_5 = nestedScrollView.findViewById(R.id.card_main_1_5);
        card_main_1_6 = nestedScrollView.findViewById(R.id.card_main_1_6);
        card_main_1_7 = nestedScrollView.findViewById(R.id.card_main_1_7);
        card_main_1_8 = nestedScrollView.findViewById(R.id.card_main_1_8);
        card_main_1_9 = nestedScrollView.findViewById(R.id.card_main_1_9);
        card_main_1_10 = nestedScrollView.findViewById(R.id.card_main_1_10);
        card_main_1_11 = nestedScrollView.findViewById(R.id.card_main_1_11);
        card_main_1_12 = nestedScrollView.findViewById(R.id.card_main_1_12);
        card_main_1_13 = nestedScrollView.findViewById(R.id.card_main_1_13);
        card_main_1_14 = nestedScrollView.findViewById(R.id.card_main_1_14);
        card_main_1_15 = nestedScrollView.findViewById(R.id.card_main_1_15);
        card_main_1_16 = nestedScrollView.findViewById(R.id.card_main_1_16);
        card_main_1_17 = nestedScrollView.findViewById(R.id.card_main_1_17);
        card_main_1_18 = nestedScrollView.findViewById(R.id.card_main_1_18);
        card_main_1_19 = nestedScrollView.findViewById(R.id.card_main_1_19);





        Glide.with(getContext()).load(R.drawable.air_strike).apply(new RequestOptions().fitCenter()).into(img_main_card_1);
        Glide.with(getContext()).load(R.drawable.nirman).apply(new RequestOptions().fitCenter()).into(img_main_card_2);
        Glide.with(getContext()).load(R.drawable.robo_night).apply(new RequestOptions().fitCenter()).into(img_main_card_3);
        Glide.with(getContext()).load(R.drawable.robo_race).apply(new RequestOptions().fitCenter()).into(img_main_card_4);
        Glide.with(getContext()).load(R.drawable.fumes).apply(new RequestOptions().fitCenter()).into(img_main_card_4_2);
        Glide.with(getContext()).load(R.drawable.chemwizz).apply(new RequestOptions().fitCenter()).into(img_main_card_5);
        Glide.with(getContext()).load(R.drawable.codetrex).apply(new RequestOptions().fitCenter()).into(img_main_card_6);
        Glide.with(getContext()).load(R.drawable.app_athon).apply(new RequestOptions().fitCenter()).into(img_main_card_7);
        Glide.with(getContext()).load(R.drawable.rule_the_sky).apply(new RequestOptions().fitCenter()).into(img_main_card_8);
        Glide.with(getContext()).load(R.drawable.lfr).apply(new RequestOptions().fitCenter()).into(img_main_card_9);
        Glide.with(getContext()).load(R.drawable.crypto).apply(new RequestOptions().fitCenter()).into(img_main_card_10);
        Glide.with(getContext()).load(R.drawable.play_with_codes).apply(new RequestOptions().fitCenter()).into(img_main_card_11);
        Glide.with(getContext()).load(R.drawable.electrade).apply(new RequestOptions().fitCenter()).into(img_main_card_12);
        Glide.with(getContext()).load(R.drawable.electromatrix).apply(new RequestOptions().fitCenter()).into(img_main_card_13);
        Glide.with(getContext()).load(R.drawable.junkyard).apply(new RequestOptions().fitCenter()).into(img_main_card_14);
        Glide.with(getContext()).load(R.drawable.tatva).apply(new RequestOptions().fitCenter()).into(img_main_card_15);
        Glide.with(getContext()).load(R.drawable.quizomania).apply(new RequestOptions().fitCenter()).into(img_main_card_16);
        Glide.with(getContext()).load(R.drawable.startup).apply(new RequestOptions().fitCenter()).into(img_main_card_17);
        Glide.with(getContext()).load(R.drawable.hitz).apply(new RequestOptions().fitCenter()).into(img_main_card_18);
        Glide.with(getContext()).load(R.drawable.crack_cat).apply(new RequestOptions().fitCenter()).into(img_main_card_19);






        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        card_main_1_1.setOnClickListener(this);
        card_main_1_2.setOnClickListener(this);
        card_main_1_3.setOnClickListener(this);
        card_main_1_4.setOnClickListener(this);
        card_main_1_4_2.setOnClickListener(this);
        card_main_1_5.setOnClickListener(this);
        card_main_1_6.setOnClickListener(this);
        card_main_1_7.setOnClickListener(this);
        card_main_1_8.setOnClickListener(this);
        card_main_1_9.setOnClickListener(this);
        card_main_1_10.setOnClickListener(this);
        card_main_1_12.setOnClickListener(this);
        card_main_1_11.setOnClickListener(this);
        card_main_1_13.setOnClickListener(this);
        card_main_1_14.setOnClickListener(this);
        card_main_1_15.setOnClickListener(this);
        card_main_1_16.setOnClickListener(this);
        card_main_1_17.setOnClickListener(this);
        card_main_1_18.setOnClickListener(this);
        card_main_1_19.setOnClickListener(this);




        card_main_1_1.setOnTouchListener(this);
        card_main_1_2.setOnTouchListener(this);
        card_main_1_3.setOnTouchListener(this);
        card_main_1_4.setOnTouchListener(this);
        card_main_1_4_2.setOnTouchListener(this);
        card_main_1_5.setOnTouchListener(this);
        card_main_1_6.setOnTouchListener(this);
        card_main_1_7.setOnTouchListener(this);
        card_main_1_8.setOnTouchListener(this);
        card_main_1_9.setOnTouchListener(this);
        card_main_1_10.setOnTouchListener(this);
        card_main_1_12.setOnTouchListener(this);
        card_main_1_11.setOnTouchListener(this);
        card_main_1_13.setOnTouchListener(this);
        card_main_1_14.setOnTouchListener(this);
        card_main_1_15.setOnTouchListener(this);
        card_main_1_16.setOnTouchListener(this);
        card_main_1_17.setOnTouchListener(this);
        card_main_1_18.setOnTouchListener(this);
        card_main_1_19.setOnTouchListener(this);




        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(700);
        img_main_card_1.startAnimation(alphaAnimation);


        alphaAnimationShowIcon = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimationShowIcon.setDuration(500);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.card_main_1_1:
                intent.setClass(getActivity(),AirStrike.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_2:
                intent.setClass(getActivity(), Nirmaan.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_3:
                intent.setClass(getActivity(),TheRoboNight.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_4:
                intent.setClass(getActivity(),Roborace.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_4_2:
                intent.setClass(getActivity(),Fumes.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_5:
                intent.setClass(getActivity(),Chemwizz.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_6:
                intent.setClass(getActivity(),Codetrex.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_7:
                intent.setClass(getActivity(),AppAthon.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_8:
                intent.setClass(getActivity(),RuleTheSky.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_9:
                intent.setClass(getActivity(),LFR.class);
                startActivity(intent);
                break;

            case R.id.card_main_1_10:
                intent.setClass(getActivity(),Crypto.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_11:
                intent.setClass(getActivity(),PlayWithCodes.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_12:
                intent.setClass(getActivity(),Electrade.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_13:
                intent.setClass(getActivity(),Electromatrix.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_14:
                intent.setClass(getActivity(),Junkyard.class);
                startActivity(intent);
                break;

            case R.id.card_main_1_15:
                intent.setClass(getActivity(),tatva.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_16:
                intent.setClass(getActivity(),Quizomania.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_17:
                intent.setClass(getActivity(),StartUp.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_18:
                intent.setClass(getActivity(),Hitz.class);
                startActivity(intent);
                break;
            case R.id.card_main_1_19:
                intent.setClass(getActivity(),CrackCat.class);
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
