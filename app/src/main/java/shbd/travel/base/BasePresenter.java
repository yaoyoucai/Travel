package shbd.travel.base;

/**
 * 项目名称：Travel
 * 类描述：
 * 创建人：yh
 * 创建时间：2016/9/9 11:15
 * 修改人：yh
 * 修改时间：2016/9/9 11:15
 * 修改备注：
 */
public abstract class BasePresenter<M, V> {
    protected V mView;
    protected M mModel;

    public void setVM(V v, M m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    protected abstract void onStart();

    public void destory() {

    }
}
