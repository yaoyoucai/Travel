package shbd.travel.fragment;

import android.os.Bundle;

import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.MapView;

import butterknife.Bind;
import shbd.travel.activity.R;
import shbd.travel.base.BaseFragment;

/**
 * Created by yh on 2016/9/8.
 */
public class SmartGuideFragment extends BaseFragment {
    @Bind(R.id.map)
    MapView mMapView;

    private AMap aMap;

    @Override
    protected void initView(Bundle savedInstanceState) {
        mMapView.onCreate(savedInstanceState);
        if (aMap == null) {
            aMap = mMapView.getMap();
        }
    }

    @Override
    public int getFragmentLayoutId() {
        return R.layout.fragment_smart_guide;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，实现地图生命周期管理
        mMapView.onSaveInstanceState(outState);
    }

}
