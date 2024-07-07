package controller;

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
    }

    private People preparePeople() {
        List<String> names = inputView.getPeopleName();
        return new People(names);
    }
}
