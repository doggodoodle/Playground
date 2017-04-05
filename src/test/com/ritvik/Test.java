package test.com.ritvik;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by u6023478 on 11/3/2016.
 */
public class Test {

    static volatile ConcurrentHashMap<String,AtomicInteger> map = new ConcurrentHashMap<>();

    static class TestInt{
        Integer integer;

        @Override
        public String toString() {
            return "TestInt{" +
                    "integer=" + integer +
                    '}';
        }

        public TestInt(Integer integer) {
            this.integer = integer;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TestInt)) return false;

            TestInt testInt = (TestInt) o;

            return integer.equals(testInt.integer);
        }

        @Override
        public int hashCode() {
            return integer%2;
        }
    }

    static void doStuff(String t){
        System.out.println("Running "+t);
        if(map.putIfAbsent("A",new AtomicInteger(1)) !=null)
            map.get("A").getAndIncrement();

    }

    static void doDelayedStuff(String t){
        System.out.println("Running "+t);
        if(map.putIfAbsent("A",new AtomicInteger(1)) !=null){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.replace("A",map.get("A"),new AtomicInteger(map.get("A").incrementAndGet()));
        }

        }


    public static void main(String[] args) {
        int i = 100;


        while (i-- > 0){
            map.clear();
            System.out.println("Test:"+i);
            test();
            if(map.get("A").intValue()!=2)
                System.out.println("FUCKKKKKKKKKKKKKKKKKKKK!!!");
        }
    }

    static void test(){
        Runnable a = () -> {
            doStuff("B");
        };

        Runnable b = () -> {
            doStuff("B");
        };

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);

        threadA.start();
        threadB.start();


        try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(map);
    }

    static class MySort implements Comparator{
        public int compare(String a, String b){
            return b.compareTo(a);
        }

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

}
