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
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.eajy.materialdesigndemo.R;
import com.eajy.materialdesigndemo.activity.AdWar;
import com.eajy.materialdesigndemo.activity.*;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static android.content.Context.MODE_PRIVATE;



public class DialogsFragment extends Fragment implements View.OnClickListener, View.OnTouchListener {

    private ImageView card_1,card_2,card_3,card_4,card_4_2,card_5,card_6,
            card_8,card_9,card_10,card_11,card_12,card_13,
            card_14,card_7,card_15;
    private CardView cul1,cul2,cul3,cul4,cul4_2,cul5,cul6,
            cul7,cul8,cul9,cul10,cul11,cul12,cul13,cul14,cul15;
    private AlphaAnimation alphaAnimation, alphaAnimationShowIcon;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_dialogs, container, false);



        card_1 = nestedScrollView.findViewById(R.id.card_1);
        card_2 = nestedScrollView.findViewById(R.id.card_2);
        card_3 = nestedScrollView.findViewById(R.id.card_3);
        card_4 = nestedScrollView.findViewById(R.id.card_4);
        card_5 = nestedScrollView.findViewById(R.id.card_5);
        card_6 = nestedScrollView.findViewById(R.id.card_6);
        card_7 = nestedScrollView.findViewById(R.id.card_7);
        card_8 = nestedScrollView.findViewById(R.id.card_8);
        card_9 = nestedScrollView.findViewById(R.id.card_9);
        card_10 = nestedScrollView.findViewById(R.id.card_10);
        card_11 = nestedScrollView.findViewById(R.id.card_11);
        card_12 = nestedScrollView.findViewById(R.id.card_12);
        card_13 = nestedScrollView.findViewById(R.id.card_13);
        card_14 = nestedScrollView.findViewById(R.id.card_14);
        card_15 = nestedScrollView.findViewById(R.id.card_15);





        cul1 = nestedScrollView.findViewById(R.id.cul1);
        cul2 = nestedScrollView.findViewById(R.id.cul2);
        cul3 = nestedScrollView.findViewById(R.id.cul3);
        cul4 = nestedScrollView.findViewById(R.id.cul4);
        cul5 = nestedScrollView.findViewById(R.id.cul5);
        cul6 = nestedScrollView.findViewById(R.id.cul6);
        cul7 = nestedScrollView.findViewById(R.id.cul7);
        cul8 = nestedScrollView.findViewById(R.id.cul8);
        cul9 = nestedScrollView.findViewById(R.id.cul9);
        cul10 = nestedScrollView.findViewById(R.id.cul10);
        cul11 = nestedScrollView.findViewById(R.id.cul11);
        cul12 = nestedScrollView.findViewById(R.id.cul12);
        cul13 = nestedScrollView.findViewById(R.id.cul13);
        cul14 = nestedScrollView.findViewById(R.id.cul14);
        cul15 = nestedScrollView.findViewById(R.id.cul15);







        Glide.with(getContext()).load(R.drawable.ad_war).apply(new RequestOptions().fitCenter()).into(card_1);
        Glide.with(getContext()).load(R.drawable.open_mic).apply(new RequestOptions().fitCenter()).into(card_2);
        Glide.with(getContext()).load(R.drawable.the_voice).apply(new RequestOptions().fitCenter()).into(card_3);
        Glide.with(getContext()).load(R.drawable.dance_fever).apply(new RequestOptions().fitCenter()).into(card_4);
        Glide.with(getContext()).load(R.drawable.parliament).apply(new RequestOptions().fitCenter()).into(card_5);
        Glide.with(getContext()).load(R.drawable.once_upon_a_time).apply(new RequestOptions().fitCenter()).into(card_6);
        Glide.with(getContext()).load(R.drawable.nukkad_natak).apply(new RequestOptions().fitCenter()).into(card_7);
        Glide.with(getContext()).load(R.drawable.the_stage).apply(new RequestOptions().fitCenter()).into(card_8);
        Glide.with(getContext()).load(R.drawable.fashionnova).apply(new RequestOptions().fitCenter()).into(card_9);
        Glide.with(getContext()).load(R.drawable.shayari).apply(new RequestOptions().fitCenter()).into(card_10);
        Glide.with(getContext()).load(R.drawable.showbuzz).apply(new RequestOptions().fitCenter()).into(card_11);
        Glide.with(getContext()).load(R.drawable.pixel).apply(new RequestOptions().fitCenter()).into(card_12);
        Glide.with(getContext()).load(R.drawable.stock_king).apply(new RequestOptions().fitCenter()).into(card_13);
        Glide.with(getContext()).load(R.drawable.treasure_hunt).apply(new RequestOptions().fitCenter()).into(card_14);
        Glide.with(getContext()).load(R.drawable.spellbee).apply(new RequestOptions().fitCenter()).into(card_15);






        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        cul1.setOnClickListener(this);
        cul2.setOnClickListener(this);
        cul3.setOnClickListener(this);
        cul4.setOnClickListener(this);
        cul5.setOnClickListener(this);
        cul6.setOnClickListener(this);
        cul7.setOnClickListener(this);
        cul8.setOnClickListener(this);
        cul9.setOnClickListener(this);
        cul10.setOnClickListener(this);
        cul12.setOnClickListener(this);
        cul11.setOnClickListener(this);
        cul13.setOnClickListener(this);
        cul14.setOnClickListener(this);
        cul15.setOnClickListener(this);





        cul1.setOnTouchListener(this);
        cul2.setOnTouchListener(this);
        cul3.setOnTouchListener(this);
        cul4.setOnTouchListener(this);
        cul5.setOnTouchListener(this);
        cul6.setOnTouchListener(this);
        cul7.setOnTouchListener(this);
        cul8.setOnTouchListener(this);
        cul9.setOnTouchListener(this);
        cul10.setOnTouchListener(this);
        cul12.setOnTouchListener(this);
        cul11.setOnTouchListener(this);
        cul13.setOnTouchListener(this);
        cul14.setOnTouchListener(this);
        cul15.setOnTouchListener(this);





        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(700);
        card_1.startAnimation(alphaAnimation);


        alphaAnimationShowIcon = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimationShowIcon.setDuration(500);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.cul1:
                intent.setClass(getActivity(),AdWar.class);
                startActivity(intent);
                break;
            case R.id.cul2:
                intent.setClass(getActivity(),OpenMic.class);
                startActivity(intent);
                break;
            case R.id.cul3:
                intent.setClass(getActivity(),TheVoice.class);
                startActivity(intent);
                break;
            case R.id.cul4:
                intent.setClass(getActivity(),DanceFever.class);
                startActivity(intent);
                break;
            case R.id.cul5:
                intent.setClass(getActivity(),Parliament.class);
                startActivity(intent);
                break;
            case R.id.cul6:
                intent.setClass(getActivity(),OnceUpon.class);
                startActivity(intent);
                break;
            case R.id.cul7:
                intent.setClass(getActivity(),NukkadNatak.class);
                startActivity(intent);
                break;
            case R.id.cul8:
                intent.setClass(getActivity(),TheStage.class);
                startActivity(intent);
                break;
            case R.id.cul9:
                intent.setClass(getActivity(),Fashionnova.class);
                startActivity(intent);
                break;
            case R.id.cul10:
                intent.setClass(getActivity(),Shayari.class);
                startActivity(intent);
                break;
            case R.id.cul11:
                intent.setClass(getActivity(),ShowBuzz.class);
                startActivity(intent);
                break;
            case R.id.cul12:
                intent.setClass(getActivity(),Pixel.class);
                startActivity(intent);
                break;
            case R.id.cul13:
                intent.setClass(getActivity(),StockKing.class);
                startActivity(intent);
                break;
            case R.id.cul14:
                intent.setClass(getActivity(),TreasureHunt.class);
                startActivity(intent);
                break;
            case R.id.cul15:
                intent.setClass(getActivity(),SpellBee.class);
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
