//
// Created by Administrator on 2018\9\12 0012.
//
#include "com_aoyang_ndkdemo_JNIForNdkbuild.h"


JNIEXPORT jstring JNICALL Java_com_aoyang_ndkdemo_JNIForNdkbuild_sayHello(JNIEnv * env, jobject obj){
    return (*env)->NewStringUTF(env,"first ndk build");
}


