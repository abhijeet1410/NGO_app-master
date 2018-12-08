package com.abhijeet14.ngo_app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhijeet14.ngo_app.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
private Fragment f = null;
private View v;
private AppCompatActivity a;
private AppCompatButton nextBtn;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_first, container, false);
        nextBtn = v.findViewById(R.id.first_fragment_next_btn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = new SecondFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_container,f);
                ft.commit();
            }
        });
        return v;
    }

}
