package shbd.travel.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;

import butterknife.ButterKnife;
import shbd.travel.utils.UIUtils;

/**
 * 项目名称：Travel
 * 类描述：fragment基类
 * 创建人：yh
 * 创建时间：2016/9/9 10:41
 * 修改人：yh
 * 修改时间：2016/9/9 10:41
 * 修改备注：
 */
public abstract class BaseFragment extends Fragment {
    protected View mContentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Fresco.initialize(UIUtils.getContext());
        mContentView = inflater.inflate(getFragmentLayoutId(), container, false);
        ButterKnife.bind(this, mContentView);
        initView(savedInstanceState);
        return mContentView;
    }

    protected abstract void initView(Bundle savedInstanceState);


    public abstract int getFragmentLayoutId();
}
