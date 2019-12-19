package com.yang.mydanli;

public class SingleTonNeiBuLei {
    private SingleTonNeiBuLei(){}
    //内部类模式
    public static SingleTonNeiBuLei getInstance(){
        return SingleHolder.singleTonNeiBuLei;
    }
    private static class SingleHolder{
        private static SingleTonNeiBuLei singleTonNeiBuLei =new SingleTonNeiBuLei();
    }
}
