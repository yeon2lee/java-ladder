package domain;

public class Person {

    private final String name;

    public Person(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("사람의 이름은 최대 5글자입니다.");
        }
    }
}
