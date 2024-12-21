package streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Tom", MALE),
                new Person("Alice", FEMALE),
                new Person("Lexi", FEMALE),
                new Person("Stacy", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        IntConsumer println = System.out::println;
        ToIntFunction<String> length = String::length;
        Function<Person, String> personStringFunction = person -> person.name;
        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email")
                );
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
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }
}

