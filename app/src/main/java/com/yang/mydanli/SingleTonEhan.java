package com.yang.mydanli;

public class SingleTonEhan {
    //饿汉式：不管需不需要直接先创建对象
    private static  SingleTonEhan singleTonEhan=new SingleTonEhan();
    //单例模式私有构造
    private SingleTonEhan (){};
    //java调用方法：1.对象调用方法 2.类名.调用（必须是静态方法）
    public static SingleTonEhan getInstance(){
        return singleTonEhan;
    }
}
