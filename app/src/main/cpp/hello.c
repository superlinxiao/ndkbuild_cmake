#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jstring Java_com_aoyang_ndkdemo_JNI_sayHello(JNIEnv *env, jobject jobj) {

    //jstring     (*NewStringUTF)(JNIEnv*, const char*);
    char *string = "my first jni";
    return (*env)->NewStringUTF(env, string);

}
/*
 * 让c代码调用jni
 * */
JNIEXPORT void JNICALL Java_com_aoyang_ndkdemo_JNI_callJava
        (JNIEnv *env, jobject jobj) {

    //1.得到字节码
    jclass jclazz = (*env)->FindClass(env, "com/aoyang/ndkdemo/JNI");
    //2.得到方法
    jmethodID jmethodIDs = (*env)->GetMethodID(env, jclazz, "callJava", "(I)V");
    //3.得到对象
    jobject jobject = (*env)->AllocObject(env, jclazz);
    //4.调用方法
    (*env)->CallVoidMethod(env, jobject, jmethodIDs, 1);
}

JNIEXPORT void JNICALL Java_com_aoyang_ndkdemo_JNI_closeSocket
        (JNIEnv *env, jobject jobj, jobject callback) {
    jclass jclazz = (*env)->FindClass(env, "com/aoyang/ndkdemo/CloseCallback");
    jmethodID jmethodIDs = (*env)->GetMethodID(env, jclazz, "onCloseListener",
                                               "(ILjava/lang/String;)V");
    jstring message  = (*env)->NewStringUTF(env,"result message");
    (*env)->CallVoidMethod(env, callback, jmethodIDs, 1, message);
}