package tech.tab.testtab;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    //This code gets the number of tabs that are available
   private final List<Fragment> fragmentList = new ArrayList<>();

   // This code gets the Titles of the Tab
    private final List<String> fragmentListTitles = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        //constructor
    }

    @Override
    public Fragment getItem(int i) {
        return null;
    }

    @Override
    public int getCount() {
        // code keeps track of the number of tabs there is automatically.
        return fragmentListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // code get the character value of the title of the tabs.
        return fragmentListTitles.get(position);
    }

    public void AddFragment(Fragment fragment, String Title){
        // Not sure what this code does yet
        fragmentList.add(fragment);
        fragmentListTitles.add(Title);
    }
}
