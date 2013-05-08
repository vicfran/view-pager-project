package es.vtr.PhoneManager.activities;

import android.support.v4.app.FragmentActivity;
import es.vtr.PhoneManager.R;
import android.os.Bundle;
import es.vtr.PhoneManager.fragments.MainFragment;


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