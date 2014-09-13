package com.mkph.mateusz.dotagameapp.Fragments;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.mkph.mateusz.dotagameapp.R;

import java.util.Random;

/**
 * Created by Mateusz on 9/7/2014.
 */
public class BaseHeroFragment extends Fragment {

    private MediaPlayer mediaPlayer;
    public static final String ARG_PAGE = "page";
    private int mPageNumber;
    private ImageButton heroPic;

    public static BaseHeroFragment create(int pageNumber) {
        BaseHeroFragment fragment = new BaseHeroFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.base_hero_fragment_layout, container, false);

        heroPic = (ImageButton)rootView.findViewById(R.id.hero_pic);
        Random r = new Random();
        int random = r.nextInt(4 - 0);

            if(random==0)
            {
                heroPic.setBackgroundResource(R.drawable.witch_doctor_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
            }
            else if(random==1)
            {
                heroPic.setBackgroundResource(R.drawable.venomancer);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);
            }
            else if(random==2)
            {
                heroPic.setBackgroundResource(R.drawable.kotlpic);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
            }
            else
            {
                heroPic.setBackgroundResource(R.drawable.treant_vert);
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.keep_rival_09);
            }

        setupListener();
        return rootView;
    }

    private void setupListener(){
        heroPic.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           mediaPlayer.start();
        }
    });
    }


}