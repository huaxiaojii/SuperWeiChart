package cn.ucai.superwechat.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.superwechat.R;
import cn.ucai.superwechat.utils.L;
import cn.ucai.superwechat.utils.MFGT;

public class GuideActivity extends BaseActivity {
   // private static final String TAG = GuideActivity.class.getSimpleName().toString();
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
    }
    @OnClick({R.id.btn_login, R.id.btn_register})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_login:
                L.e("Login"+view.getId());
                MFGT.gotoLogin(this);
                L.e("this="+this);
//                this.startActivity(new Intent(this,LoginActivity.class));
            case R.id.btn_register:
                L.e("Register"+view.getId());
//                this.startActivity(new Intent(this,RegisterActivity.class));
                MFGT.gotoRegister(this);
                break;
        }
    }
}
