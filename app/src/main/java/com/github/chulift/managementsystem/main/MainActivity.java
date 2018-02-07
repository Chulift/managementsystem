package com.github.chulift.managementsystem.main;

import android.content.res.Resources;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.widget.ListView;

import com.github.chulift.managementsystem.R;
import com.github.chulift.managementsystem.base.BaseMVPActivity;

/**
 * Created by rpeeradon on 2/7/2018.
 */

public class MainActivity extends BaseMVPActivity<MainActivityInterface.Presenter>
    implements MainActivityInterface.View {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    @Override
    public MainActivityInterface.Presenter createPresenter() {
        return MainActivityPresenter.create();
    }

    @Override
    public int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    public void bindView() {
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.navigation);
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
}
