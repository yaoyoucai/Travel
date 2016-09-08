package shbd.travel.bean;

/**
 * Created by yh on 2016/9/8.
 */
public class Tab {

    private String title;
    private int icon;
    private Class fragment;

    public Tab(Class fragment, String title, int icon) {
        this.title = title;
        this.icon = icon;
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Class getFragment() {
        return fragment;
    }

    public void setFragment(Class fragment) {
        this.fragment = fragment;
    }
}
