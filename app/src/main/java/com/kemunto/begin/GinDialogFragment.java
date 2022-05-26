package com.kemunto.begin;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GinDialogFragment extends Dialog Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootview = inflater.inflate(R.layout.fragment_gin_dialog, container, false);
        getDialog().setTitle("Simple Dialog");
        return rootview;

    }
}
