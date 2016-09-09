package shbd.travel.fragment.home;

import android.os.Bundle;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import butterknife.Bind;
import shbd.travel.activity.R;
import shbd.travel.base.BaseFragment;
import shbd.travel.utils.UIUtils;

/**
 * Created by yh on 2016/9/8.
 */
public class HomeFragment extends BaseFragment implements HomeContract.View {
    @Bind(R.id.slider)
    SliderLayout sliderShow;


    @Override
    protected void initView(Bundle savedInstanceState) {

        TextSliderView textSliderView = new TextSliderView(UIUtils.getContext());
        textSliderView
                .description("Game of Thrones")
                .image("http://images.boomsbeat.com/data/images/full/19640/game-of-thrones-season-4-jpg.jpg");

        sliderShow.addSlider(textSliderView);
    }

    @Override
    public int getFragmentLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void onStop() {
        sliderShow.stopAutoCycle();
        super.onStop();
    }
}
