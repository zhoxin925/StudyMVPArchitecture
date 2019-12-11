package com.example.temp123.studymvparchitecture.ui.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.temp123.studymvparchitecture.R;
import com.example.temp123.studymvparchitecture.base.activity.BaseActivity;
import com.example.temp123.studymvparchitecture.constant.MainConstant;
import com.example.temp123.studymvparchitecture.model.ArticleData;
import com.example.temp123.studymvparchitecture.model.ArticleDataList;
import com.example.temp123.studymvparchitecture.model.BaseResponse;
import com.example.temp123.studymvparchitecture.presenter.MainPresenter;
import com.example.temp123.studymvparchitecture.ui.adapter.MainAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements MainConstant.View {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    @BindView(R.id.navigationview)
    NavigationView navigationview;

    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myPresenter.getMsg();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onViewCreated() {
        super.onViewCreated();
        mainAdapter = new MainAdapter(this);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(mainAdapter);
    }

//    @OnClick({R.id.button, R.id.textview})
//    void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.button:
//                myPresenter.getMsg();
//                break;
//
//            case R.id.textview:
//
//                break;
//            default:
//                break;
//        }
//    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void showMsg(BaseResponse<ArticleDataList> datas) {
        mainAdapter.setmDatas(datas.getData().getDatas());
    }
}
