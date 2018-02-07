package com.github.chulift.managementsystem.template;

import com.github.chulift.managementsystem.base.BaseMVPPresenter;

/**
 * Created by rpeeradon on 2/7/2018.
 */

public class CustomActivityPresenter
        extends BaseMVPPresenter<CustomActivityInterface.View>
        implements CustomActivityInterface.Presenter {
    public static CustomActivityInterface.Presenter create() {
        return new CustomActivityPresenter();
    }
}
