package com.aoyang.ndkdemo;

/**
 * Description
 *
 * java调动对应的c代码
 * Author lizheng
 * Create Data  2018\9\11 0011
 */
public class JNIForNdkbuild {

  /**
   * 调用c代码对应的方法
   * @return
   */
  public native String sayHello();
}
