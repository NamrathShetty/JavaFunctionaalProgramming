package imparative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imparative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Tom", MALE),
                new Person("Alice", FEMALE),
                new Person("Lexi", FEMALE),
                new Person("Stacy", FEMALE),
                new Person("Bob", MALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // Declerative approach

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
//        System.out.println(personPredicate.test(new Person("Alice", FEMALE)));

        people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
        enum Gender {
        MALE, FEMALE;
    }
}