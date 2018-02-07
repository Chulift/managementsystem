package com.github.chulift.managementsystem.main;

import com.github.chulift.managementsystem.base.BaseMVPPresenter;

/**
 * Created by rpeeradon on 2/7/2018.
 */

public class MainActivityPresenter extends BaseMVPPresenter<MainActivityInterface.View>
    implements MainActivityInterface.Presenter {
    public static MainActivityInterface.Presenter create() {
        return new MainActivityPresenter();
    }
}
