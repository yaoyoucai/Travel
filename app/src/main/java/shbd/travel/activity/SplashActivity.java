package shbd.travel.activity;

import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import shbd.travel.adapter.SplashAdapter;
import shbd.travel.base.BaseActivity;
import shbd.travel.utils.UIUtils;

/**
 * 项目名称：Travel
 * 类描述：闪屏页面
 * 创建人：yh
 * 创建时间：2016/9/7 15:23
 * 修改人：yh
 * 修改时间：2016/9/7 15:23
 * 修改备注：
 */
public class SplashActivity extends BaseActivity {
    @Bind(R.id.vp_splash)
    ViewPager mVpSplash;

    private int[] images=new int[]{R.drawable.guide_1,R.drawable.guide_2,R.drawable.guide_3};

    private  List<ImageView> mImageViews=new ArrayList<>();
    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {

        for (int i = 0;  i <images.length ;  i++) {
            ImageView imageView=new ImageView(UIUtils.getContext());
            imageView.setImageResource(images[i]);
            mImageViews.add(imageView);
        }

        mVpSplash.setAdapter(new SplashAdapter(mImageViews));


    }


}
