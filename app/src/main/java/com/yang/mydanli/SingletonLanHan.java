package com.yang.mydanli;

public class SingletonLanHan {
    private static SingletonLanHan singletonLanHan = null;
    private SingletonLanHan (){}
    public static SingletonLanHan getInstance(){
        //CPU，有一个CPU同时就可以运行几个线程
        //单个CPU，多个线程是怎么运行的，抢占时间片
        //两个线程A，B
        if(singletonLanHan == null){
            //线程A先进来
            //B也进来
            singletonLanHan =new SingletonLanHan();
        }
        return singletonLanHan;
    }
}
