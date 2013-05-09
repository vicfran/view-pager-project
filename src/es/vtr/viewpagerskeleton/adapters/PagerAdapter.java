package es.vtr.viewpagerskeleton.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import es.vtr.viewpagerskeleton.fragments.FragmentA;
import es.vtr.viewpagerskeleton.fragments.FragmentB;
import es.vtr.viewpagerskeleton.fragments.FragmentC;

import java.util.ArrayList;

/**
 * This is the adapter used to feed the view pager with fragments
 */
public class PagerAdapter extends FragmentPagerAdapter {

    /**
     * Number of fragments (pages of the view pager)
     */
    private static final int PAGES = 3;

    /**
     * Store fragments (pages of the view pager) to access them easily
     */
    private ArrayList<Fragment> pages = new ArrayList<Fragment>(PAGES);

    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

        /*
         * Build as many fragments (pages) as you have defined in PAGES and
         * store them
         */
        pages.add(new FragmentA());
        pages.add(new FragmentB());
        pages.add(new FragmentC());
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
