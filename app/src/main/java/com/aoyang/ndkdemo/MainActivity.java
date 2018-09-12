package com.aoyang.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aoyang.ndkdemo3.R;

public class MainActivity extends AppCompatActivity {

  // Used to load the 'native-lib' library on application startup.
  static {
    System.loadLibrary("native-lib");
    System.loadLibrary("hello");
    System.loadLibrary("HelloNdkbuild");
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = findViewById(R.id.sample_text);
    tv.setText(stringFromJNI());
    JNI jni = new JNI();
    tv.setText(jni.sayHello());

    TextView ndk = findViewById(R.id.build_ndk);
    JNIForNdkbuild jniForNdkbuild = new JNIForNdkbuild();
    String s = jniForNdkbuild.sayHello();
    ndk.setText(s);
  }

  /**
   * A native method that is implemented by the 'native-lib' native library,
   * which is packaged with this application.
   */
  public native String stringFromJNI();
}
