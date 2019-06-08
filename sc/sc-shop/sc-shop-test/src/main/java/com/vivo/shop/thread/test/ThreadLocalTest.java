package com.vivo.shop.thread.test;

import java.util.Random;

public class ThreadLocalTest {


   static ThreadLocal<Integer> x =  new ThreadLocal<Integer>();
   static ThreadLocal<MyThreadScopeData> myThreadScopeData =  new ThreadLocal<MyThreadScopeData>();

    public static void main(String[] args) {
        for (int i = 0;i<2;i++){
            final int bb = i;
            new Thread(new Runnable() {

                @Override
                public void run() {
                    int data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName() + "has put data:" + data);
                    x.set(data);
                    MyThreadScopeData cc= new MyThreadScopeData();
                    cc.setAge(bb);
                    cc.setName("name-" + bb);
                    myThreadScopeData.set(cc);
                    new A().get();
                    new B().get();
                }
            }).start();
        }
    }
    static class B {
        public void get() {
            int data = x.get();
            MyThreadScopeData datax = myThreadScopeData.get();
            System.out.println("B get" + data);
            System.out.println("B get name" + datax.getName() + "age" + datax.getAge());
        }
    }

    static class A {
        public void get() {
            int data = x.get();
            MyThreadScopeData datax = myThreadScopeData.get();
            System.out.println("A get" + data);
            System.out.println("A get name " + datax.getName() + "age" + datax.getAge());
        }
    }


}
