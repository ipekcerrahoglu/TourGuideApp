package com.example.lenovo.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        setupTablayout();
    }


    private void setupTablayout() {
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.addTab(tabLayout.newTab().setText(R.string.category_diving));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.category_paragliding));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.category_antiphellos));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.category_meis));
        tabLayout.setupWithViewPager(viewPager);
    }
}

