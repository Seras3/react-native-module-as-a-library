package com.example.androidappbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;

import java.util.Arrays;

public class ReactNativeWebViewActivity extends BaseActivity {
    @Override
    protected String getMainComponentName() { return "ReactNativeWebView"; }

    @Override
    protected  ReactNativeHost createReactNativeHost(Application app) {
        return new ReactNativeHost(app) {
            @Override
            public boolean getUseDeveloperSupport() {return false;}

            @Override
            protected List<ReactPackage> getPackages() {
                return Arrays.asList(new MainReactPackage());
            }

            @Override
            protected String getBundleAssetName() { return "index.abdroid.bundle"; }
        };
    }
}