package com.archermind.yuvrenderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.nio.ByteBuffer;

public class MainActivity extends AppCompatActivity {

    private VideoRendererView mVideoRendererView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoRendererView = findViewById(R.id.gl_suface_view);


    }

    @Override
    protected void onResume() {
        super.onResume();
        mVideoRendererView.setParams(false,null,800,480);
        mVideoRendererView.newDataArrived(Util.read("yuv420p.yuv", this));
        mVideoRendererView.newDataArrived(Util.read("yuv420p.yuv", this));
        mVideoRendererView.newDataArrived(Util.read("test.yuv", this));
    }
}