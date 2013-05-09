package es.vtr.viewpagerskeleton.activities;

import android.support.v4.app.FragmentActivity;
import es.vtr.viewpagerskeleton.R;
import android.os.Bundle;
import es.vtr.viewpagerskeleton.fragments.MainFragment;

/**
 * This is the main activity. Holds main fragment in which
 * child fragments of each page are stored.
 */
public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment fragment = new MainFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
    }
}