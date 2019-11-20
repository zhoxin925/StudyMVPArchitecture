package com.example.temp123.studymvparchitecture.base.presenter;

import com.example.temp123.studymvparchitecture.base.view.IBaseView;

/**
 * Created by temp123 on 2019/11/19.
 */

public interface IBasePresenter<T extends IBaseView> {

    void attachView(T view);

    void detachView();
}
