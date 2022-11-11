package com.example.androidappbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;

import java.util.Arrays;

public abstract class BaseActivity extends ReactActivity {
    private ReactNativeHost mReactNativeHost;

    @Override
    protected abstract String getMainComponentName();

    protected abstract ReactNativeHost createReactNativeHost(Application app);

    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegate(this, getMainComponentName()) {
            @Override
            protected  ReactNativeHost getReactNativeHost() {
                if(mReactNativeHost == null) {
                    mReactNativeHost = createReactNativeHost(getApplication());
                }
                return mReactNativeHost;
            }
        };
    }
}

