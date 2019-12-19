package com.yang.mydanli;

public class SIngleTonShuangChongJiaoYan {
    //需要volatitle 关键字
    private volatile static SIngleTonShuangChongJiaoYan sIngleTonShuangChongJiaoYan =null;
    private SIngleTonShuangChongJiaoYan (){
        int a=20;
    }

    //同步后线程安全了，一般不这么直接同步，因为效率太低
    /*public synchronized static SingleTon3 getInstance(){
        if (sSingleTon3 == null){
            sSingleTon3 = new SingleTon3();
        }
        return sSingleTon3;
    }*/
    public static SIngleTonShuangChongJiaoYan getInstance(){
        //第一次判断作用；避免不必要的同步
        if(sIngleTonShuangChongJiaoYan == null){
            synchronized (SIngleTonShuangChongJiaoYan.class){
                //第二次判断；避免创建多个对象
                sIngleTonShuangChongJiaoYan = new SIngleTonShuangChongJiaoYan();
            }
        }
        return sIngleTonShuangChongJiaoYan;
    }
}
