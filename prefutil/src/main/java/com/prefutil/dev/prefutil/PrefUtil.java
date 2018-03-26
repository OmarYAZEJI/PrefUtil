package com.prefutil.dev.prefutil;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by omary on 3/24/2018.
 *
 */

public class PrefUtil {
    private static final PrefUtil prefUtil = new PrefUtil();
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    static int PRIVATE_MODE = 0;

    static PrefUtil Init() {
        return prefUtil;
    }

    private PrefUtil() {}

    public static PrefUtil Init(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(context.getPackageName(), PRIVATE_MODE);
            editor = sharedPreferences.edit();
        }
        return prefUtil;
    }

    /*ToDo: Save values to a shared preference*/

    public void save(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public void save(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void save(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public void save(String key, long value) {
        editor.putLong(key, value);
        editor.commit();
    }

    public void save(String key, float value) {
        editor.putFloat(key, value);
        editor.commit();
    }

    /*ToDo: Get values from a shared preference */

    public String getString(String key) {
        return sharedPreferences.getString(key, "");
    }

    public boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public Float getFloat(String key) {
        return sharedPreferences.getFloat(key, 0);
    }

    public Long getLong(String key) {
        return sharedPreferences.getLong(key, 0);
    }

    /*ToDo: Remove value from a shared preference*/

    public void removeValue(String key) {
        editor.remove(key);
        editor.commit();
    }

    /*ToDo: Remove all values from a shared preference*/
    public void clearALl() {
        editor.clear();
        editor.commit();
    }

    public Map<String, ?> getAll() {
        return sharedPreferences.getAll();
    }
}
