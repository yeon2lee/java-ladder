package controller;

import domain.Ladder;
import domain.People;
import view.InputView;
import view.OutputView;

import java.util.List;

public class LadderController {
    InputView inputView;
    OutputView outputView;

    public LadderController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        People people = preparePeople();
        Ladder ladder = prepareLadder(people);
        outputView.printPeopleName(people);
        outputView.printLadder(ladder);
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
