package CoreJava;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // ArrayList demonstration
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList demonstration
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dell");
        linkedList.add("HP");
        linkedList.add("Lenovo");
        System.out.println("LinkedList: " + linkedList);

        // HashSet demonstration
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet demonstration
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // HashMap demonstration
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Doe");
        hashMap.put(3, "Jane");
        System.out.println("HashMap: " + hashMap);
    }
}

