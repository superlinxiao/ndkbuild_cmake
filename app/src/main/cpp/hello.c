//
// Created by Administrator on 2018\9\11 0011.
//
#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

/*
 *
 *
 * */
jstring Java_com_aoyang_ndkdemo_JNI_sayHello(JNIEnv *env, jobject jobj) {

    //jstring     (*NewStringUTF)(JNIEnv*, const char*);
    char *string = "my first jni";
    return (*env)->NewStringUTF(env, string);

}