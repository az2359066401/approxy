package com.vivo.shop.thread.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueCommunication {


    public static void main(String[] args) {

        final Business business = new Business();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i =1;i<=50;i++){
                            business.sub(i);
                        }

                    }
                }
        ).start();

        for (int i=1;i<=50;i++){
            business.main(i);
        }
    }



    static class Business{

        BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<Integer>(1);
        BlockingQueue<Integer> queue2 = new ArrayBlockingQueue<Integer>(1);


        {

            try {
                queue2.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        //子线程  queue1
        public void sub(int i ){

            try {
                queue1.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int j = 0;j<=10;j++){
                System.out.println("sub thread sequence of" + j);
            }


            try {
                queue2.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        //主线程 queue2
        public void main(int i){
            try {
                queue2.put(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int j =1;j<=100;j++){
                System.out.println("main thread sequence of " + j);
            }

            try {
                queue1.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }




        }

    }

}
