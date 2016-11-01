package cn.ucai.superwechat.ui;

import android.os.Bundle;
import android.view.View;

import cn.ucai.superwechat.utils.MFGT;

/**
 * Created by User on 2016/11/1.
 */

public class GuideActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        utterKnife.bind(this);
    }
    @OnClick({R.id.btn_login, R.id.btn_register})
       public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                MFGT.gotoLogin(this);
                break;
            case R.id.btn_register:
                MFGT.gotoRegister(this);
                break;
        }
    }
}
