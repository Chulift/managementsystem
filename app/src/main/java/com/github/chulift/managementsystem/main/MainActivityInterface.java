package com.github.chulift.managementsystem.main;

import com.github.chulift.managementsystem.base.BaseMVPInterface;

/**
 * Created by rpeeradon on 2/7/2018.
 */

public class MainActivityInterface {
    interface View extends BaseMVPInterface.View{}

    interface Presenter extends BaseMVPInterface.Presenter<MainActivityInterface.View>{}
}
