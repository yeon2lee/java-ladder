package controller;

import domain.Ladder;
import domain.People;
import view.InputView;

import java.util.List;

public class LadderController {
    InputView inputView;

    public LadderController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        People people = preparePeople();
        Ladder ladder = prepareLadder(people);
    }

    private People preparePeople() {
        List<String> names = inputView.getPeopleName();
        return new People(names);
    }

    private Ladder prepareLadder(People people) {
        int ladderHeight = inputView.getLadderHeight();
        int numberOfPeople = people.getParticipantsSize();
        return new Ladder(ladderHeight, numberOfPeople);
    }
}
