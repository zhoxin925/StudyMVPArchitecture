package com.example.temp123.studymvparchitecture.constant;

import com.example.temp123.studymvparchitecture.base.presenter.IBasePresenter;
import com.example.temp123.studymvparchitecture.base.view.IBaseView;
import com.example.temp123.studymvparchitecture.model.ArticleData;
import com.example.temp123.studymvparchitecture.model.ArticleDataList;
import com.example.temp123.studymvparchitecture.model.BaseResponse;

/**
 * Created by temp123 on 2019/11/19.
 */

public interface MainConstant {

    interface View extends IBaseView {

        void showMsg(BaseResponse<ArticleDataList> datas);
    }

    interface presenter extends IBasePresenter<View> {
        void getMsg();
    }
}
