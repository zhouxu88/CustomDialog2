package com.dearxy.customdialog;

import android.app.Dialog;
import android.content.Context;

/**
 * Created by 周旭 on 2017/4/5.
 */

public class CustomDialog extends Dialog {

    public CustomDialog(Context context,int layoutId) {

        //使用自定义Dialog样式
        super(context, R.style.custom_dialog);

        //指定布局
        setContentView(layoutId);

        //点击外部不可消失
        //setCancelable(false);
    }
}
