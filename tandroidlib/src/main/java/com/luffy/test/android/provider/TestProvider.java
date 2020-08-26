package com.luffy.test.android.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name 测试-内容提供者
 */
public class TestProvider extends ContentProvider {

    public static final String METHOD_KEY = "test";
    public static final String METHOD_VALUE = "test_value";

    @Override
    public Bundle call(String method, String arg, Bundle extras) {
        Bundle bundle = new Bundle();
        if (METHOD_KEY.equals(method)) {
            bundle.putString(METHOD_VALUE, "我是数据");
        }
        return bundle;
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

}
