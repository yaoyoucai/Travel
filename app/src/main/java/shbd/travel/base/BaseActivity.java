package shbd.travel.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import butterknife.ButterKnife;
import shbd.travel.manager.AppManager;

/**
 * 项目名称：Travel
 * 类描述：activity基类
 * 创建人：yh
 * 创建时间：2016/9/7 15:48
 * 修改人：yh
 * 修改时间：2016/9/7 15:48
 * 修改备注：
 */
public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initView();
        AppManager.getAppManager().addActivity(this);
    }

    /**
     * 返回布局id值
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 初始化布局内容
     */
    protected abstract void initView();

    /**
     * 返回键---结束当前Activity（堆栈中最后一个压入的）
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        try {
            AppManager.getAppManager().finishActivity();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
