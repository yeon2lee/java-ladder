package domain;

import java.util.List;

public class People {

    private final List<Person> people;

    public People(List<String> names) {
        validate(names);
        List<Person> people = names.stream().map(Person::new).toList();
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    private void validate(List<String> names) {
        if (names.size() < 2) {
            throw new IllegalArgumentException("참여할 사람은 두 명 이상이어야 합니다.");
        }
    }

    public int getParticipantsSize() {
        return people.size();
    }
}
