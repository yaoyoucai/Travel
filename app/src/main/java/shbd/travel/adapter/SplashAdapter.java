package shbd.travel.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

import shbd.travel.base.BaseApplication;

/**
 * 项目名称：Travel
 * 类描述：闪屏页面adapter
 * 创建人：yh
 * 创建时间：2016/9/8 10:47
 * 修改人：yh
 * 修改时间：2016/9/8 10:47
 * 修改备注：
 */
public class SplashAdapter extends PagerAdapter {
    private Context mContext;

    private List<ImageView> mImageViews;

    public SplashAdapter(List<ImageView> imageViews) {
        this.mImageViews =imageViews;
        this.mContext = BaseApplication.getApplication();
    }


    @Override
    public int getCount() {
        return mImageViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView=mImageViews.get(position);
        container.addView(imageView);
        return imageView;
    }
}
