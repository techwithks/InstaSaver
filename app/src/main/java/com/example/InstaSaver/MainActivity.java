package com.example.InstaSaver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.widget.TableLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem mphoto, mvideo, mreel, migtv, mdp;
    Toolbar toolbar;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mphoto=findViewById(R.id.photo);
        mvideo=findViewById(R.id.video);
        mreel=findViewById(R.id.reel);
        migtv=findViewById(R.id.igtv);
        mdp=findViewById(R.id.dp);


        ViewPager viewPager=findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);

        pagerAdapter=new PagerAdapter(getSupportFragmentManager(),5);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4)
                {
                    pagerAdapter.notifyDataSetChanged();
                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));







    }
}