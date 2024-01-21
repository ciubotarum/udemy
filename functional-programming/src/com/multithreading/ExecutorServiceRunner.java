package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    private int number;
    public Task(int number) {
        this.number = number;
    }
    public void run() { // SIGNATURE
        System.out.print("\nTask " + number + " Started");
        for (int i = number * 100; i <= number * 100 + 99; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n Task " + number + " Done");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.execute(new Task1());
//        executorService.execute(new Thread(new Task2()));
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));

//        System.out.println("\nTask3 Kicked Off");
//
//        // Task3
//        for (int i = 301; i <= 399; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.print("\n Task3 Done");
//
//        System.out.print("\n Main Done");
        executorService.shutdown();
    }
}
