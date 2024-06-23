package classwork.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashTreeSet {
    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            myList1.add("smth" + i);
        }
        System.out.println(System.currentTimeMillis() - t0);
        t0 = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            myList2.add("smth" + i);
        }
        System.out.println(System.currentTimeMillis() - t0);

        long t1 = System.currentTimeMillis();
        for (String word : myList1) {

        }
        System.out.println(System.currentTimeMillis() - t1);
        t1 = System.currentTimeMillis();
        for (String word : myList2) {

        }
        System.out.println(System.currentTimeMillis() - t1);
    }
}
