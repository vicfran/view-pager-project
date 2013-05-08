package es.vtr.viewpagerskeleton.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.vtr.viewpagerskeleton.R;
import es.vtr.viewpagerskeleton.adapters.PagerAdapter;

public class MainFragment extends Fragment {

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pagerAdapter = new PagerAdapter(getFragmentManager());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(pagerAdapter);
    }
}
