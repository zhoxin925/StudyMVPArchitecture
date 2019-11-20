package com.example.temp123.studymvparchitecture.main;

import com.example.temp123.studymvparchitecture.base.presenter.IBasePresenter;
import com.example.temp123.studymvparchitecture.base.view.IBaseView;

/**
 * Created by temp123 on 2019/11/19.
 */

public interface MainConstant {

    interface View extends IBaseView {

        void showMsg(String s);
    }

    interface presenter extends IBasePresenter<View> {
        void getMsg();
    }
}
