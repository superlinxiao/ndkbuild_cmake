package com.aoyang.ndkdemo;

/**
 * Description
 * Author lizheng
 * Create Data  2018\11\26 0026
 */
public class CloseCallback {

  private OnCloseListener mListener;

  public interface OnCloseListener {

    void onCloseListener(int resultCode, String message);
  }

  public void setOnCloseListener(OnCloseListener listener) {
    this.mListener = listener;
  }

  /**
   * @param resultCode 返回码
   * @param message 消息
   */
  public void onCloseListener(int resultCode, String message) {
    if (mListener != null) {
      mListener.onCloseListener(resultCode, message);
    }
  }

}
