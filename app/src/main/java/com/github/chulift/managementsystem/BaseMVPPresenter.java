package com.github.chulift.managementsystem;

import com.github.chulift.managementsystem.exceptions.MvpViewNotAttachedException;

import java.lang.ref.WeakReference;

/**
 * Created by Chulift on 2/6/2018.
 */

public abstract class BaseMVPPresenter<V extends BaseMVPInterface.View> implements BaseMVPInterface.Presenter<V> {

    private WeakReference<V> mMVPView;

    @Override
    public void attachView(V mvpView) {
        mMVPView = new WeakReference<V>(mvpView);
    }

    @Override
    public void detachView() {
        mMVPView = null;
    }

    @Override
    public V getView() throws NullPointerException {
        if (mMVPView != null) return mMVPView.get();
        throw new MvpViewNotAttachedException();
    }

    @Override
    public void onViewCreate() {

    }

    @Override
    public void onViewStart() {

    }

    @Override
    public void onViewStop() {

    }

    @Override
    public void onViewDestroy() {

    }
}
