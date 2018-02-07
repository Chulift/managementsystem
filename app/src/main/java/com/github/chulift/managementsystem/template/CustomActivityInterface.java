package com.github.chulift.managementsystem.template;

import com.github.chulift.managementsystem.base.BaseMVPInterface;

/**
 * Created by rpeeradon on 2/7/2018.
 */

public interface CustomActivityInterface {
    public interface View extends BaseMVPInterface.View {}

    public interface Presenter extends BaseMVPInterface.Presenter<CustomActivityInterface.View> {}
}
