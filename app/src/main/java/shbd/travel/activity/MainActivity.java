package shbd.travel.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import shbd.travel.base.BaseActivity;
import shbd.travel.bean.Tab;
import shbd.travel.fragment.SmartGuideFragment;
import shbd.travel.fragment.HomeFragment;
import shbd.travel.fragment.MineFragment;
import shbd.travel.utils.UIUtils;
import shbd.travel.widget.FragmentTabHost;

/**
 * 项目名称：Travel
 * 类描述：主页面
 * 创建人：yh
 * 创建时间：2016/9/8 17:26
 * 修改人：yh
 * 修改时间：2016/9/8 17:26
 * 修改备注：
 */
public class MainActivity extends BaseActivity {
    private FragmentTabHost mTabHost;
    private List<Tab> tabs = new ArrayList<>();
    private LayoutInflater mInflater;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        String[] tabNames = UIUtils.getStringArray(R.array.tab_name_array);

        tabs.add(new Tab(HomeFragment.class, tabNames[0], R.drawable.selector_icon_home));
        tabs.add(new Tab(SmartGuideFragment.class, tabNames[1], R.drawable.selector_icon_guide));
        tabs.add(new Tab(MineFragment.class, tabNames[2], R.drawable.selector_icon_mine));

        mInflater = LayoutInflater.from(UIUtils.getContext());
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(UIUtils.getContext(), getSupportFragmentManager(), R.id.realtabcontent);

        for (Tab tab : tabs) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(tab.getTitle());
            tabSpec.setIndicator(buildIndicator(tab));
            mTabHost.addTab(tabSpec, tab.getFragment(), null);
        }

        mTabHost.setCurrentTab(0);
    }

    /**
     * 初始化每个页签的布局
     * @param tab
     * @return
     */
    private View buildIndicator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        ImageView img = (ImageView) view.findViewById(R.id.icon_tab);
        TextView text = (TextView) view.findViewById(R.id.txt_indicator);

        img.setImageResource(tab.getIcon());
        text.setText(tab.getTitle());
        return view;
    }
}
