package com.dearxy.customdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        findViewById(R.id.open_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //弹出自定义dialog
                CustomDialog dialog = new CustomDialog(mContext);
                dialog.show();
            }
        });
    }
}
