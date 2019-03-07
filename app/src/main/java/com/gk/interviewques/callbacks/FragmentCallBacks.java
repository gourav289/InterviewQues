package com.gk.interviewques.callbacks;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.gk.interviewques.enums.FragmentOperation;

public interface FragmentCallBacks {
    public void onNewFragment(FragmentOperation operation, Fragment fragment);
}
