package shbd.travel.activity;

import android.content.Intent;
import android.widget.Button;

import butterknife.Bind;
import butterknife.OnClick;
import shbd.travel.base.BaseActivity;

/**
 * 项目名称：Travel
 * 类描述：登录activity
 * 创建人：yh
 * 创建时间：2016/9/8 17:13
 * 修改人：yh
 * 修改时间：2016/9/8 17:13
 * 修改备注：
 */
public class LoginActivity extends BaseActivity {
    @Bind(R.id.loginBtn)
    Button mBtnLogin;
    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

    }

    @OnClick(R.id.loginBtn)
    public void login(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
