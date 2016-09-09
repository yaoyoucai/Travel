package shbd.travel.fragment.home;


import shbd.travel.base.BaseModel;
import shbd.travel.base.BasePresenter;
import shbd.travel.base.BaseView;

/**
 * 项目名称：Travel
 * 类描述：
 * 创建人：yh
 * 创建时间：2016/9/9 11:22
 * 修改人：yh
 * 修改时间：2016/9/9 11:22
 * 修改备注：
 */
public interface HomeContract {
    interface Model extends BaseModel {

    }

    interface View extends BaseView {

    }

    abstract class Presenter extends BasePresenter<Model, View> {

    }
}
