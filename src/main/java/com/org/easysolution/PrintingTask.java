package com.org.easysolution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintingTask implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The Printable task: " + i);
        }
    }
}

class Application {
    private final static Logger log = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        Thread thread = new Thread(new PrintingTask());
        thread.start();
        log.log(Level.INFO, "MainThread");

    }
}