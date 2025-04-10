package org.example.lesson15;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDersi {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Ayxan", 34);
        map.put("Rauf", 17);
        map.put("Ismayil", 24);

//        System.out.println(map);

//        System.out.println("Ismayilin yashi: " + map.get("Ismayil"));
//        System.out.println("Haminin yashi: " + map.values());
//
//        for(Map.Entry<String, Integer> entry: map.entrySet()) {
//            System.out.println("Ad: " + entry.getKey() + " Yash: " + entry.getValue());
//        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        do {
            if (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                System.out.println("Ad: " + entry.getKey() + " Yash: " + entry.getValue());
            }
        } while (iterator.hasNext());
    }
}
