package com.mkph.mateusz.dotagameapp.Fragments;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mkph.mateusz.dotagameapp.R;

public class WitchDoctorFragment extends Fragment {

    MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.wdoc_win_03);
        return inflater.inflate(R.layout.witch_doctor_fragment_layout, container, false);
    }

    public void play(){
        mediaPlayer.start();
    }


}
