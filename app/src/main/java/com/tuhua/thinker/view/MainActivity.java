package com.tuhua.thinker.view;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                installPatchFile();

            }
        });
    }

    private void installPatchFile() {
        //安装补丁包
        TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), Environment.getExternalStorageDirectory().getAbsolutePath()+"/tinker");

//        Toast.makeText(MainActivity.this,"I am testing tinker...",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"终于实现了Android热修复！哈哈",Toast.LENGTH_LONG).show();
    }

    //初始化组件
    private void setViews() {
        btLoad= (Button) findViewById(R.id.bt_load_file);
    }

}
