package com.example.temp123.studymvparchitecture.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.temp123.studymvparchitecture.base.presenter.IBasePresenter;
import com.example.temp123.studymvparchitecture.base.view.IBaseView;

/**
 * Created by temp123 on 2019/11/19.
 */

public abstract class BaseActivity<T extends IBasePresenter> extends AbstractSimpleActivity
    implements IBaseView {

    protected T myPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        if(myPresenter != null) {
            myPresenter.detachView();
            myPresenter = null;
        }
        super.onDestroy();
    }

    protected abstract T createPresenter();

    @Override
    protected void onViewInit() {
        myPresenter = createPresenter();
        if(myPresenter != null) {
            myPresenter.attachView(this);
        }
    }

    @Override
    protected void initEventAndData() {

    }

}
