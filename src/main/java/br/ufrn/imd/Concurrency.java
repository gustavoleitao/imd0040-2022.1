package br.ufrn.imd;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Concurrency implements Runnable{

    private static int number = 0;

public void increment(){
    AtomicInteger atomicInteger = new AtomicInteger(number);
    number = atomicInteger.incrementAndGet();
}

    @Override
    public void run() {
        increment();
    }

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        for (int i = 0 ;i < 200000; i++){
            var t = new Thread(new Concurrency());
            t.start();
            threads.add(t);
        }

        for (Thread t : threads){
            t.join();
        }

        System.out.println(number);

    }



}
