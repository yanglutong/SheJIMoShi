package com.yang.mydanli;


/**
 * java 如果不写构造，系统会提供一个无参构造
 *
 */
public class SingleTonShuangChongJIaoYan {
    //饿汉式：不管需不需要，直接先创建对象
    private static SingleTonShuangChongJIaoYan mSingleTon = new SingleTonShuangChongJIaoYan();

    private SingleTonShuangChongJIaoYan(){}

    //java调用方法：1.对象调用方法 2。类名.调用（必须是静态方法）
    public static SingleTonShuangChongJIaoYan getInstance(){
        return mSingleTon;
    }
}
