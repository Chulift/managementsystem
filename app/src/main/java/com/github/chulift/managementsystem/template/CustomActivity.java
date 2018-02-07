package com.github.chulift.managementsystem.template;

import android.os.PersistableBundle;
import android.os.Bundle;

import com.github.chulift.managementsystem.base.BaseMVPActivity;

public class CustomActivity extends BaseMVPActivity<CustomActivityInterface.Presenter>
        implements CustomActivityInterface.View {

    @Override
    public CustomActivityInterface.Presenter createPresenter() {
        return CustomActivityPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return 0;
    }

    @Override
    public void bindView() {

    }

    @Override
    public void setupInstance() {

    }

    @Override
    public void setupView() {

    }

    @Override
    public void initialize() {

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
