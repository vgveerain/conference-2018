package com.example.shubhamgulati.confluence;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnNext;
    Button nButton;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.vp);
        vp.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(vp);
        btnNext = findViewById(R.id.btnNext);
//        nButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                vp.setCurrentItem(1);
//            }
//        });

            }
    class MyPageAdapter extends FragmentPagerAdapter{

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(vp.getCurrentItem()==0){
                            vp.setCurrentItem(1,true);
                        }
                        else if(vp.getCurrentItem()==1){
                            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                            startActivity(intent);
                        }

                    }
                });
                    return new FragmentA();
                case 1:
                    return new FragmentC();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
