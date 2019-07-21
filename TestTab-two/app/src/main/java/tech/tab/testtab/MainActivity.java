package tech.tab.testtab;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //declaring the Tab layout and other app functions for the app
    public TabLayout tabLayout;
    public AppBarLayout appBarLayout;
    public ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now making the tab and appBar layout and viewPager active
        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appabar);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //adding Fragment and Titles for the ViewPagerAdapter to find and populate
        adapter.AddFragment(new userloginFragment(),"User Login");
        adapter.AddFragment(new userloginFragment(),"Payed Service");
        adapter.AddFragment(new userloginFragment(),"Volunteer Service");

        // adapter Setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
