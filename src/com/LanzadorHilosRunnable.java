package com;

public class LanzadorHilosRunnable {

	public static void main(String[] args) throws InterruptedException {
        Thread h = new Thread(new Hilo("runnable"));
        h.start();
        Thread.sleep(50);
        System.out.println(h.getName() + " -> " + h.getState());
    }
}
