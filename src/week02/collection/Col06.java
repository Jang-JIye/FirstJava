package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col06 {
    public static void main(String[] args) {
        // Map : key - value pair -> 중 요 !!
        // key라는 값으로 unique하게 보장이 되야 함!!
        // Map -> HashMap, TreeMap으로 응용!

        Map<String, Integer> intMap = new HashMap<>();

        // 키값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 키
        intMap.put("삼", 15); // 중복 키
        intMap.put("삼", 16); // 중복 키 -> 마지막에 쓴 값으로 덮어쓰기 됨

        // key 값 전체 출력(향상된 for문)
        for (String key : intMap.keySet()) {
            System.out.println(key); //중복키는 println이 안됨
        }

        //value 값 전체 출력(향상된 for문)
        for (Integer value : intMap.values()) {
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));
    }
}
