package shbd.travel.base;

import android.app.Application;

/**
 * 项目名称：Travel
 * 类描述：application基础类
 * 创建人：yh
 * 创建时间：2016/9/7 15:47
 * 修改人：yh
 * 修改时间：2016/9/7 15:47
 * 修改备注：
 */
public class BaseApplication extends Application {
    //获取到主线程的上下文
    private static BaseApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
    }

    public static BaseApplication getApplication() {
        return mContext;
    }
}
