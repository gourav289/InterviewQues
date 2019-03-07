package com.gk.interviewques.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.gk.interviewques.R;
import com.gk.interviewques.base.BaseActivtiy;
import com.gk.interviewques.callbacks.FragmentCallBacks;
import com.gk.interviewques.enums.FragmentOperation;
import com.gk.interviewques.fragments.AddFragment;
import com.gk.interviewques.fragments.HomeFragment;

public class HomeActivity extends BaseActivtiy implements FragmentCallBacks {

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomeFragment mFragment=new HomeFragment();
        addFragmentHome(mFragment,true);
        mFragment.setFragmentListener(this);
    }

    @Override
    public void onNewFragment(FragmentOperation operation, Fragment fragment) {
        if(operation==FragmentOperation.ADD)
            addFragmentHome(fragment,true);
        else if(operation==FragmentOperation.REPLACE)
            replaceFragmentHome(fragment,true);

        if(fragment instanceof AddFragment)
            ((AddFragment)fragment).setFragmentListener(this);
    }
}
