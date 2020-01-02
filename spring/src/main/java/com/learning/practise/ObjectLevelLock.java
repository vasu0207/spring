package com.learning.practise;

public class ObjectLevelLock  implements Runnable{
    @Override
    public void run() {
        lock();
    }

    private void lock() {
        synchronized(this){
            System.out.println("ObjectLevelLock.lock " + Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch(Exception e) {
                e.printStackTrace();
            }
            System.out.println("ObjectLevelLock.lock  end" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
    System.out.println("Entered Main");
        ObjectLevelLock bl = new ObjectLevelLock();
        Thread t1 = new Thread(bl); t1.setName("t1");
        Thread t2 = new Thread(bl); t2.setName("t2");
        ObjectLevelLock b2 = new ObjectLevelLock();
        Thread t3 = new Thread(b2); t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    System.out.println("Exist Main");
    }
}
