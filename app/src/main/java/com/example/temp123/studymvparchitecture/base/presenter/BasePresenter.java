package com.example.temp123.studymvparchitecture.base.presenter;

import com.example.temp123.studymvparchitecture.base.view.IBaseView;

/**
 * Created by temp123 on 2019/11/19.
 */

public class BasePresenter<T extends IBaseView> implements IBasePresenter<T> {

    protected T mView;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }
}
