package com.evidencias.pina.unidades;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * Created by Pina on 17/11/14.
 */
public class Unidad1 extends ActionBarActivity {

    ViewPager vp;
    private vpAdapter miAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unidad1);

        vp = (ViewPager) findViewById(R.id.viewpager);
        miAdapter = new vpAdapter();
        vp.setAdapter(miAdapter);

    }

    private class vpAdapter extends PagerAdapter {

        public int getCount() {

            return 9;
        }

        public boolean isViewFromObject(View view, Object object){

            return view == ((LinearLayout)object);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {

            ((ViewPager)container).removeView((LinearLayout)object);

        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            LayoutInflater inflater = (LayoutInflater)container.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = null;

            switch (position){

                case 0:
                    v= inflater.inflate(R.layout.uni1act1, null);
                    break;

                case 1:
                    v= inflater.inflate(R.layout.uni1act2, null);
                    break;

                case 2:
                    v= inflater.inflate(R.layout.uni1act3, null);
                    break;

                case 3:
                    v= inflater.inflate(R.layout.uni1act4, null);
                    break;

                case 4:
                    v= inflater.inflate(R.layout.uni1act5, null);
                    break;

                case 5:
                    v= inflater.inflate(R.layout.uni1act6, null);
                    break;

                case 6:
                    v= inflater.inflate(R.layout.uni1act7, null);
                    break;

                case 7:
                    v= inflater.inflate(R.layout.uni1act8, null);
                    break;

                case 8:
                    v= inflater.inflate(R.layout.uni1act9, null);
                    break;
            }

            ((ViewPager)container).addView(v, 0);
            return v;

        }

        @Override
        public void startUpdate(ViewGroup container) {

        }

        @Override
        public Parcelable saveState() {

            return null;
        }
    }


}