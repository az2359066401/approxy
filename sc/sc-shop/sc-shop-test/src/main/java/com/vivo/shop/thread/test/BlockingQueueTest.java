package com.vivo.shop.thread.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BlockingQueueTest {


    public static void main(String[] args) {
        //定义容量为3的队列
        final BlockingQueue queue = new ArrayBlockingQueue(3);

        for (int i = 0;i<2;i++){
            new Thread(){
                @Override
                public void run() {
                    while (true){
                        try {
                            Thread.sleep((long)(Math.random()*10000));
                            System.out.println("准备放数据 " +  Thread.currentThread().getName() +"size ---"+ queue.size());
                            queue.put(1);
                            System.out.println("数据取完线程队列大小" +  Thread.currentThread().getName() +"size ---"+ queue.size());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }.start();
        }


        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                        System.out.println("准备取数据 " + Thread.currentThread().getName() +"size ---"+ queue.size());
                        queue.take();
                        System.out.println("数据取完当前队列大小 " + Thread.currentThread().getName() +"size ---"+ queue.size());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();


    }
}
