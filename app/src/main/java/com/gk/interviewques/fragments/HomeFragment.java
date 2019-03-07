package com.gk.interviewques.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.gk.interviewques.R;
import com.gk.interviewques.base.BaseFragment;
import com.gk.interviewques.callbacks.FragmentCallBacks;
import com.gk.interviewques.enums.FragmentOperation;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeFragment extends BaseFragment {

    @BindView(R.id.rv_questions)
    RecyclerView rvQuestions;
    @BindView(R.id.ed_search)
    EditText edSearch;
    FragmentCallBacks mFragmentCallBacks;

    @Override
    public View setLayout(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    public void setFragmentListener(FragmentCallBacks mFragmentCallBacks){
        this.mFragmentCallBacks=mFragmentCallBacks;
    }


    @OnClick(R.id.fab_add)
    public void onAddClick(){
        Fragment mFragment=new AddFragment();
        if (mFragmentCallBacks!=null)
            mFragmentCallBacks.onNewFragment(FragmentOperation.ADD,mFragment);
    }


}
