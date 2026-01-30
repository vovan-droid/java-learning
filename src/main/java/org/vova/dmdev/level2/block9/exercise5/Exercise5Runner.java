package org.vova.dmdev.level2.block9.exercise5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

public class Exercise5Runner {

    public static void main(String[] args) {
        Person person1 = new Person("Petya", "Petrov", 32);
        Person person2 = new Person("Anya", "Ivanova", 32);
        Person person3 = new Person("Sasha", "Vasyliev", 0);
        Person person4 = new Person("Andrei", "Ivanov", 45);
        Person person5 = new Person("Ivan", "Petrovich", 102);
        Person person6 = new Person("Ivan", "Petrovichev", 103);

        List<Person> listOfPersons = List.of(person1, person2, person3, person4, person5, person6);

        listOfPersons.stream()
                .filter(person -> person.getFullName().length() <= 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);


        Map<Integer, List<Person>> map = listOfPersons.stream()
                .collect(groupingBy(Person::getAge));
        System.out.println(map);


        Map<Integer, List<String>> map1 = listOfPersons.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getFullName, toList())));
        System.out.println(map1);
    }
}
