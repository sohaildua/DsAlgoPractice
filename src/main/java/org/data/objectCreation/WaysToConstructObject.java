package org.data.objectCreation;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class WaysToConstructObject {
    private int x;
    private String y;

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // new method
        WaysToConstructObject waysToConstructObject = new WaysToConstructObject();

        //new Instance method
       /* Class b = Class.forName("waysToConstructObject");
        WaysToConstructObject waysToConstructObject1 = (WaysToConstructObject) b.newInstance();

        //new Instance method constructor
        Class c = Class.forName("waysToConstructObject");
        //WaysToConstructObject waysToConstructObject2 = (WaysToConstructObject)c.getConstructor().newInstance();*/

        // clone

        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.forEach(System.out::println);
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");

        List<String> stringList = new ArrayList<>();
        namesMap.forEach((key, value) -> stringList.add(value));
        System.out.println(stringList);

        String text = """
                {
                  "name": "John Doe",
                  "age": 45,
                  "address": "Doe Street, 23, Java Town"
                }
                """;
        System.out.println(text);
    }
}
