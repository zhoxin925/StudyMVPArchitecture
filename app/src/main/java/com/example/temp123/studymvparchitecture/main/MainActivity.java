package com.example.temp123.studymvparchitecture.main;

import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.example.temp123.studymvparchitecture.R;
import com.example.temp123.studymvparchitecture.base.activity.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements MainConstant.View {

    @BindView(R.id.button)
    AppCompatButton button;
    @BindView(R.id.textview)
    AppCompatTextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.button, R.id.textview})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                myPresenter.getMsg();
                break;

            case R.id.textview:

                break;
            default:
                break;
        }
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void showMsg(String s) {
        textview.setText(s);
    }
}
