package com.aoyang.ndkdemo;

import android.util.Log;

import javax.security.auth.callback.Callback;

/**
 * Description
 * <p>
 * java调动对应的c代码
 * Author lizheng
 * Create Data  2018\9\11 0011
 */
public class JNI {

  private static final String TAG = "JNI";

  /**
   * 调用c代码对应的方法
   *
   * @return
   */
  public native String sayHello();

  /**
   * 通知c去调用java
   *
   * @return
   */
  public native void callJava();

  /**
   * 通知c去调用java
   *
   * @return
   */
  public native void closeSocket(CloseCallback callback);

  public void callJava(int num) {
    Log.e(TAG, "get num:" + num);
  }

  public static void callStaticJava(int num) {
    Log.e(TAG, "get num from static :" + num);
  }
}
