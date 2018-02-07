package com.github.chulift.managementsystem.base;

/**
 * Created by Chulift on 2/6/2018.
 */

public interface BaseMVPInterface {
    interface View {
        Presenter getPresenter();
    }

    interface Presenter<V extends BaseMVPInterface.View> {
        void attachView(V mvpView);

        void detachView();

        V getView();

        void onViewCreate();

        void onViewDestroy();

        void onViewStart();

        void onViewStop();
    }
}
