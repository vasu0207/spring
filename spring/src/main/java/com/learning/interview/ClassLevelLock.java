package com.learning.interview;

public class ClassLevelLock implements Runnable {
    @Override
    public void run() {
        lock();
    }

    private void lock() {
        System.out.println("lock entered");
        synchronized (ClassLevelLock.class) {
            System.out.println("ClassLevelLock.lock" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
    System.out.println("Entered Main");
        ClassLevelLock cl = new ClassLevelLock();
        Thread t1 = new Thread(cl);  t1.setName("t1");
        Thread t2 = new Thread(cl); t2.setName("t2");
        ClassLevelLock cl2 = new ClassLevelLock();
        Thread t3 = new Thread(cl2); t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    System.out.println("Exist Main");
    }
}
