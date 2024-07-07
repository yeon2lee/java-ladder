package view;

import domain.People;
import domain.Person;

import java.util.List;

public class OutputView {
    public void printPeopleName(People people) {
        List<String> peopleName = people.getPeople().stream().map(Person::getName).toList();
        List<String> formattedPeopleName = peopleName.stream()
                .map(m -> String.format("%5s", m))
                .toList();
        System.out.println(String.join(" ", formattedPeopleName));
    }
}
