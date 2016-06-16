package com.yue.customcamera;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yue.customcamera.activity.CameraActivity;

public class MainActivity extends Activity {

    private Button btn_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn_camera = (Button)findViewById(R.id.btn_camera);
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });
    }
}
