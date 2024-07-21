package domain;

import java.util.List;

public class Result {
    private People people;
    private Ladder ladder;
    private String choice;

    public Result(People people, Ladder ladder, String choice) {
        this.people = people;
        this.ladder = ladder;
        this.choice = choice;
    }

    public String calculate(int start) {
        List<List<Boolean>> points = ladder.getPoints();
        int N = points.get(0).size();
        int position = start;
        for (int i = 0; i < points.size(); i++) {
            if (position - 1 >= 0 && points.get(i).get(position - 1)) {
                position--;
                continue;
            }
            if (position < N && points.get(i).get(position)) {
                position++;
            }
        }
        return ladder.getGameResult().get(position);
    }

    private void validate() {
        if (!choice.equals("all")) {
            throw new IllegalArgumentException("이름을 잘못 입력하셨습니다.");
        }
    }

    public String getResult() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Person person : people.getPeople()) {
            if (choice.equals(person.getName())) {
                return calculate(count);
            }
            sb.append(person.getName() + " : ");
            sb.append(calculate(count) + "\n");
            count++;
        }
        validate();
        return sb.toString();
    }

}
