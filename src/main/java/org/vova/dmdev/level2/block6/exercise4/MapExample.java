package org.vova.dmdev.level2.block6.exercise4;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petro = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(1, "Sveta", "Svetikova");

        Map<Integer,Person> map = new HashMap<>(16);
        map.put(ivan.getId(), ivan);
        map.put(petro.getId(), petro);
        map.putIfAbsent(sveta.getId(), sveta);

        System.out.println(map.get(petro.getId()));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Person person : map.values()) {
            System.out.println(person.getFirstName());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println(map.containsKey(4));
        System.out.println(map.get(4));
        System.out.println(map.getOrDefault(4, sveta));
        System.out.println(map.getOrDefault(2, sveta));
        System.out.println(map.containsKey(2));
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
