package com.example.temp123.studymvparchitecture.core.http;

import com.example.temp123.studymvparchitecture.model.ArticleDataList;
import com.example.temp123.studymvparchitecture.model.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HttpApi {

    String BASE_URL = "https://www.wanandroid.com/";

    @GET("article/list/{num}/json")
    Observable<BaseResponse<ArticleDataList>> getArticleList(@Path("num") int num);

}
