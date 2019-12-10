package com.example.temp123.studymvparchitecture.main;

import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.temp123.studymvparchitecture.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestAdapter extends BaseQuickAdapter<String, TestAdapter.ViewHolder> {

    public TestAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(ViewHolder helper, String item) {
        helper.textView.setText(item);
    }

    class ViewHolder extends BaseViewHolder {

        @BindView(R.id.textview)
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
