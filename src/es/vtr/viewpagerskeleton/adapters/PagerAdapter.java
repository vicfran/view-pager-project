package es.vtr.viewpagerskeleton.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import es.vtr.viewpagerskeleton.fragments.FirstFragment;
import es.vtr.viewpagerskeleton.fragments.SecondFragment;
import es.vtr.viewpagerskeleton.fragments.ThirdFragment;

import java.util.Vector;

public class PagerAdapter extends FragmentPagerAdapter {

    private static final int PAGES = 3;
    private Vector<Fragment> pages = new Vector<Fragment>(3);

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

        pages.add(new FirstFragment());
        pages.add(new SecondFragment());
        pages.add(new ThirdFragment());
    }

    @Override
    public int getCount() {
        return PAGES;
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }
}
