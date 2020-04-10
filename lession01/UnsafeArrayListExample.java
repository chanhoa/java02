package lession1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnsafeArrayListExample {
    public static void main(String[] args) throws InterruptedException{
        List<Integer> unsafeArrayList = new ArrayList<>();
        unsafeArrayList.add(1);
        unsafeArrayList.add(2);
        unsafeArrayList.add(3);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable task = () -> {
            incrementArrayList(unsafeArrayList);
        };

        for (int i = 0; i <100; i++){
            executorService.submit(task);
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(unsafeArrayList);
    }

    private static void incrementArrayList(List<Integer> unsafeAArrayList){
        for (int i = 0; i < unsafeAArrayList.size(); i++){
            Integer value = unsafeAArrayList.get(i);
            unsafeAArrayList.set(i, value + 1);
        }
    }
}