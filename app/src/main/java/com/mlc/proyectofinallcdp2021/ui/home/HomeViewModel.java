package com.mlc.proyectofinallcdp2021.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mlc.proyectofinallcdp2021.menualimentos;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private Button btnirmenu;
    private Context mCont;



    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");



    }

    public LiveData<String> getText() {
        return mText;
    }
}