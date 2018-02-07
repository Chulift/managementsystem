package com.github.chulift.managementsystem.base;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseMVPActivity<P extends BaseMVPInterface.Presenter>
        extends AppCompatActivity
        implements BaseMVPInterface.View {
    private P presenter;
    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            presenter = createPresenter();
            presenter.attachView(this);
            int layoutResId = getLayoutView();
            setContentView(layoutResId);
            bindView();
            setupInstance();
            setupView();
            getPresenter().onViewCreate();
            if (savedInstanceState == null) initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public P getPresenter() {
        return presenter;
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    public void restoreView(Bundle savedInstanceState) {

    }

    public abstract P createPresenter();

    public abstract int getLayoutView();

    public abstract void bindView();

    public abstract void setupInstance();

    public abstract void setupView();

    public abstract void initialize();
}
