package org.example;

import java.util.HashMap;
import java.util.Map;

public class MemoryErrorInJava {
    //web: http://burnignorance.com/java-web-development-tips/how-to-avoid-memory-leak-issue-in-java/
    //web: https://www.baeldung.com/java-memory-leaks

    //exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    //occurs when the heap is full
    /*public static void main(String[] args) {
        int[] array = new int[Integer.MAX_VALUE];
    }*/

    //            memory leak
    //memory leak and performance issue in java
    //heap space is the memory allocated to the java process

    public static void main(String[] args) {
        //memory leak error
        String s = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s == s2);//true
        System.out.println(s3==s4);//false
        System.out.println(s==s3);//false
        System.out.println(s2==s4);//false
        //to solve this problem we use intern() method (it is used to return the string from the pool)
        //string pool is a memory area where all the string literals are stored
        System.out.println(s==s3.intern()); //true
        System.out.println(s2==s4.intern());//true
        //memory leak error with integer
        //also we can use Integer.valueOf() method to solve this problem

        //GC Overhead Limit Exceeded is a memory error
        // it occurs when the garbage collector is unable to free up enough memory to continue the execution of the program
        Map<Long, Long> map = new HashMap<>();
        for (long i = 0l; i < Long.MAX_VALUE; i++) {
            map.put(i, i);
        }
        //to solve this problem we can use the following code
        //map.clear();
        //map = null;
        //System.gc();
        //or we can use the following code
        //map = new HashMap<>();

        //Number of Thread Issues   (java.lang.OutOfMemoryError: unable to create new native thread)
        //it occurs when the number of threads exceeds the limit of the operating system
        //example System.out.println(Integer.MAX_VALUE);//2147483647
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            new Thread(()->{
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        //to solve this problem we can use the following code
        //we can use the thread pool
        //we can use the executor framework (it is used to execute the tasks)
        //example
        //ExecutorService executorService = Executors.newFixedThreadPool(10);
        //for (int i = 0; i < Integer.MAX_VALUE; i++) {
        //    executorService.submit(()->{
        //        try {
        //            Thread.sleep(1000000);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }
        //    });
        //}

        //PermGen Issues (java.lang.OutOfMemoryError: PermGen space)
        //it occurs when the permanent generation space is full
        //permgen space is the memory area where the metadata of the classes are stored
        //metadata is the information about the classes
        //example
        //List<String> list = new ArrayList<>();
        //int i = 0;
        //while (true) {
        //    list.add(String.valueOf(i++).intern());
        //}
        //to solve this problem we can use the following code
        //
        //List<String> list = new ArrayList<>();
        //int i = 0;
        //while (true) {
        //    list.add(String.valueOf(i++).intern());
        //}
        //list = null;
        //System.gc();
        //or we can use the following code
        //java -XX:PermSize=10M -XX:MaxPermSize=10M org.example.FunctionnalInterfaces.MemoryErrorInJava

        //out of swap space
        //it occurs when the swap space is full
        //swap space is the memory area used by the operating system to store the data of the process








    }

}
