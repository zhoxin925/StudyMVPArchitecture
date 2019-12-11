package com.example.temp123.studymvparchitecture.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.temp123.studymvparchitecture.base.ActivityCollector;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by temp123 on 2019/11/19.
 */

public abstract class AbstractSimpleActivity extends AppCompatActivity {

    protected AbstractSimpleActivity mActivity;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        mActivity = this;
        ActivityCollector.getInstance().addActivity(mActivity);
        unbinder = ButterKnife.bind(this);

        onViewCreated();
        initEventAndData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.getInstance().removeActivity(mActivity);
        if(unbinder != null && unbinder != Unbinder.EMPTY) {
            unbinder.unbind();
            unbinder = null;
        }
    }

    protected abstract int getLayoutId();

    protected abstract void onViewCreated();

    protected abstract void initEventAndData();

}
