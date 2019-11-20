package com.example.temp123.studymvparchitecture.main;

import com.example.temp123.studymvparchitecture.base.presenter.BasePresenter;

/**
 * Created by temp123 on 2019/11/19.
 */

public class MainPresenter extends BasePresenter<MainConstant.View>
        implements MainConstant.presenter {

    @Override
    public void attachView(MainConstant.View view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    int n = 0;
    @Override
    public void getMsg() {
        String ss = "哈喽，你好呀！！！" + (n++);

        mView.showMsg(ss);
    }
}
