LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := HelloNdkbuild   #指定了生成的动态链接库的名字
LOCAL_SRC_FILES := HelloNdkbuild.c #指定了C的源文件叫什么名字

include $(BUILD_SHARED_LIBRARY)  # 制定要生成动态链接库