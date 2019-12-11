package com.example.temp123.studymvparchitecture.presenter;

import com.example.temp123.studymvparchitecture.base.presenter.BasePresenter;
import com.example.temp123.studymvparchitecture.constant.MainConstant;
import com.example.temp123.studymvparchitecture.core.http.HttpHelperImpl;
import com.example.temp123.studymvparchitecture.model.ArticleDataList;
import com.example.temp123.studymvparchitecture.model.BaseResponse;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by temp123 on 2019/11/19.
 */

public class MainPresenter extends BasePresenter<MainConstant.View>
        implements MainConstant.presenter {

    HttpHelperImpl httpHelper = new HttpHelperImpl();

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
        httpHelper.getArticleList(0)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse<ArticleDataList>>() {
                    Disposable mDisposable;
                    @Override
                    public void onSubscribe(Disposable d) {
                        mDisposable = d;
                    }

                    @Override
                    public void onNext(BaseResponse<ArticleDataList> articleDataBaseResponse) {
                        if(articleDataBaseResponse != null) {
                            mView.showMsg(articleDataBaseResponse);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("onError");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete");
                    }
                });
    }
}
