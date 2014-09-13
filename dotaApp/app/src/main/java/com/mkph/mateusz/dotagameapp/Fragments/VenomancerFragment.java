package com.mkph.mateusz.dotagameapp.Fragments;

import android.app.Activity;
import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.mkph.mateusz.dotagameapp.HomeScreenActivity;
import com.mkph.mateusz.dotagameapp.R;

/**
 * Created by Mateusz on 9/6/2014.
 */
public class VenomancerFragment extends Fragment {

    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View V = inflater.inflate(R.layout.venomancer_fragment_layout, container, false);
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.venm_rare_01);

        return V;
    }


    public void play(View view){
        mediaPlayer.start();
    }
}
