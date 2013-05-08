package es.vtr.PhoneManager.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.vtr.PhoneManager.R;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup containfer, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, containfer, false);
    }
}
