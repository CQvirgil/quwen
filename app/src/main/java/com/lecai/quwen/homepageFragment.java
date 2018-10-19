package com.lecai.quwen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class homepageFragment extends Fragment {

    public homepageFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static homepageFragment newInstance() {
        homepageFragment fragment = new homepageFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homepage, container, false);
    }
}
