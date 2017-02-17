package com.tuhua.thinker.view;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tuhua.thinker.R;

public class MainActivity extends AppCompatActivity {
    private Button btLoad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setViews();

        setListener();
    }

    private void setListener() {
        btLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //安装补丁包
                TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), Environment.getExternalStorageDirectory().getAbsolutePath());
            }
        });
    }

    //初始化组件
    private void setViews() {
        btLoad= (Button) findViewById(R.id.bt_load_file);
    }

}
