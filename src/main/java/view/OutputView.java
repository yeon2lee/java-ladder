package view;

import domain.Ladder;
import domain.Line;
import domain.People;
import domain.Person;

import java.util.List;
import java.util.StringJoiner;

public class OutputView {
    public void printPeopleName(People people) {
        List<String> peopleName = people.getPeople().stream().map(Person::getName).toList();
        List<String> formattedPeopleName = peopleName.stream()
                .map(m -> String.format("%5s", m))
                .toList();
        System.out.println(String.join(" ", formattedPeopleName));
    }

    public void printLadder(Ladder ladder) {
        ladder.getPoints().forEach(this::printLine);
    }

    private void printLine(List<Boolean> line) {
        StringJoiner joiner = new StringJoiner("|", "    |", "|");
        line.forEach(exist -> joiner.add(selectPoint(exist)));
        System.out.println(joiner);
    }

    private String selectPoint(Boolean exist) {
        if (exist) {
            return "-----";
        }
        return "     ";
    }
}
