package com.android.calico;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    public static final int FRAGMENT_CONTAINER = R.id.main_container;
    private FragmentActivity activity;

    public static void loadFragment(FragmentActivity activity, int contentId, Fragment fragment) {
        FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
        transaction.add(contentId, fragment, fragment.getClass().getSimpleName());
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        loadFragment(activity, FRAGMENT_CONTAINER, new VehicleFragment());

    }

}