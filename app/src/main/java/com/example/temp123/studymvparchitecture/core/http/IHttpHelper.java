package com.example.temp123.studymvparchitecture.core.http;

import com.example.temp123.studymvparchitecture.model.ArticleDataList;
import com.example.temp123.studymvparchitecture.model.BaseResponse;

import io.reactivex.Observable;

public interface IHttpHelper {

    Observable<BaseResponse<ArticleDataList>> getArticleList(int num);
}
