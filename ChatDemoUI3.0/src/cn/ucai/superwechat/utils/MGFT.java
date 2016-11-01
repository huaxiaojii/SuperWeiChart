package cn.ucai.superwechat.utils;

import android.app.Activity;
import android.content.Intent;

import cn.ucai.superwechat.ui.LoginActivity;
import cn.ucai.superwechat.ui.RegisterActivity;

/**
 * Created by User on 2016/11/2.
 */

public class MGFT {
    public static void finish(Activity activity){
        activity.finish();
        activity.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    public static void startActivity(Activity context,Class<?> cls){
        Intent intent = new Intent();
        intent.setClass(context,cls);
        startActivity(context,intent);
    }

    public static void startActivity(Context context,Intent intent){
        context.startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }


    public static void startActivityForResult(Activity context,Intent intent,int requestCode){
        context.startActivityForResult(intent,requestCode);
        context.overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }

    public static void gotoLogin(Activity context){
        startActivity(context, LoginActivity.class);
    }

    public static void gotoRegister(Activity context){
        startActivity(context, RegisterActivity.class);
    }
}
}
