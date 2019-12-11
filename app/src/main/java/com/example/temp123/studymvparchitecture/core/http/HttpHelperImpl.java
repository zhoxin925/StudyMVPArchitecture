package com.example.temp123.studymvparchitecture.core.http;

import com.example.temp123.studymvparchitecture.core.http.test.HttpManager;
import com.example.temp123.studymvparchitecture.model.ArticleDataList;
import com.example.temp123.studymvparchitecture.model.BaseResponse;

import io.reactivex.Observable;

public class HttpHelperImpl implements IHttpHelper {

    @Override
    public Observable<BaseResponse<ArticleDataList>> getArticleList(int num) {
        HttpManager manager = new HttpManager();
        HttpApi api = manager.getRetrofit().create(HttpApi.class);
        return api.getArticleList(num);
    }
}
