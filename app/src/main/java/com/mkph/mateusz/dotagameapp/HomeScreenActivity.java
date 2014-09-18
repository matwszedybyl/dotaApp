package com.mkph.mateusz.dotagameapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ListView;

import com.mkph.mateusz.dotagameapp.Fragments.BaseHeroFragment;


public class HomeScreenActivity extends FragmentActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private MediaPlayer mediaPlayer;
    private ListView mDrawerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }

    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm)
        {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            BaseHeroFragment frag = BaseHeroFragment.create(position);
            return frag;
        }

        @Override
        public int getCount() {
            return 108;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            BaseHeroFragment frag = BaseHeroFragment.create(position);
            String heroName = frag.getHeroName(position);
            return heroName;
        }

    }
}
