package com.gk.interviewques.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gk.interviewques.R;
import com.gk.interviewques.base.BaseFragment;
import com.gk.interviewques.callbacks.FragmentCallBacks;

public class AddFragment extends BaseFragment {
    private FragmentCallBacks mFragmentCallBacks;
    @Override
    public View setLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add,container,false);
    }

    public void setFragmentListener(FragmentCallBacks mFragmentCallBacks){
        this.mFragmentCallBacks=mFragmentCallBacks;
    }
}
