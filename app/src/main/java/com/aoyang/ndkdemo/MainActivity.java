package com.aoyang.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.aoyang.ndkdemo3.R;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MainActivity";
  static {
    System.loadLibrary("hello");
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void call(View view) {
    JNI jni = new JNI();
    jni.callJava();
  }

  public void callWithobj(View view) {
    JNI jni = new JNI();
    CloseCallback closeCallback = new CloseCallback();
    closeCallback.setOnCloseListener(new CloseCallback.OnCloseListener() {
      @Override
      public void onCloseListener(int resultCode, String message) {
        Log.i(TAG,"result:"+resultCode+"  "+message);
      }
    });
    jni.closeSocket(closeCallback);
  }
}
