package general.lambda;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Brante", 60),
                new Person("Matthew", "Arnold", 60)
        );

        //people.stream().forEach(p -> System.out.println(p.getFirstName()));

        people.stream()
                .filter(p-> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));


        Stream<Person>  p = people.stream();
    }
}
