package com.vivo.shop.thread.test;

import java.util.concurrent.*;

public class CallableAndFuture {


    public static void main1(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();

        Future<String> submit = threadPool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return String.format("res %s", "haha");
            }
        });
        System.out.println("wait result");
        try {
            System.out.println("get result" + submit.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

    public static void main2(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        CompletionService executorCompletionService = new ExecutorCompletionService<>(threadPool);

        for (int i =1 ;i<=10;i++){
            final int seq = i;
            executorCompletionService.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    return seq/2;
                }
            });
        }

        for (int i=0;i<10;i++){
            try {
                System.out.println(executorCompletionService.take().get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main3(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();

        //裁判  运动员
        //实现一个人等待其他人通知他  实现一个人通知多个人的效果
        final CountDownLatch cdOrder = new CountDownLatch(1);//吹口哨
        final CountDownLatch cdAnswer = new CountDownLatch(3);//主线程

        for (int i=0;i<3;i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {

                    System.out.println("准备接受命令" + Thread.currentThread().getName());
                    try {
                        System.out.println("cdAnswer cnt" +  cdAnswer.getCount());
                        System.out.println("cdOrder cnt" +  cdOrder.getCount());
                        cdOrder.await();

                        System.out.println("cdAnswer cnt" +  cdAnswer.getCount());
                        System.out.println("cdOrder cnt" +  cdOrder.getCount());
                        System.out.println("已经接受命令" + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep((long)(Math.random()*10000));

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("回应命令处理结果 " + Thread.currentThread().getName());
                    cdAnswer.countDown();
                    System.out.println("cdAnswer cnt" +  cdAnswer.getCount());
                    System.out.println("cdOrder cnt" +  cdOrder.getCount());

                }
            };
            service.execute(runnable);


        }


        //主线程  main方法代码
        try {
            Thread.sleep((long)(Math.random()*10000));
            System.out.println("即将发布命令" + Thread.currentThread().getName());
            cdOrder.countDown();//计数器减1
            cdAnswer.await();
            System.out.println("已发送命令  正在等待结果" + Thread.currentThread().getName());
            System.out.println("已经收到结果" + Thread.currentThread().getName());
            System.out.println("cdAnswer cnt" +  cdAnswer.getCount());
            System.out.println("cdOrder cnt" +  cdOrder.getCount());



        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



    // semaphore 实现线程
    public static void main5(String[] args) {


        ExecutorService executorService = Executors.newCachedThreadPool();

        final Semaphore semaphore = new Semaphore(3);
        for (int i=0;i<10;i++){

            Runnable runnable = new Runnable() {

                @Override
                public void run() {
                    try {
                        semaphore.acquire();//获取资源  同时自能有三个线程进来
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("当前进入线程 ： " + Thread.currentThread().getName());

                    try {
                        Thread.sleep((long)(Math.random()*10000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程离开 " + Thread.currentThread().getName());
                    semaphore.release();
                }
            };

            executorService.execute(runnable);
        }



    }

}
