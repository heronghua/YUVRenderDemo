package com.archermind.yuvrenderdemo;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Util {

    public static byte[]  read( String assetFileName, Context context) {
        InputStream inputStream = null;

        try {
            inputStream = context.getAssets().open(assetFileName);
            int len = inputStream.available();
            byte[] buffer = new byte[len];
            inputStream.read(buffer);
            return buffer;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}
