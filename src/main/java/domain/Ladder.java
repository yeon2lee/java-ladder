package domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> lines;
    private List<String> gameResult;

    public Ladder(int height, int numberOfPeople, List<String> gameResult) {
        validateHeight(height);
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            lines.add(new Line(numberOfPeople));
        }
        this.lines = lines;
        this.gameResult = gameResult;
    }

    public List<List<Boolean>> getPoints() {
        return lines.stream()
                .map(Line::getPoints)
                .toList();
    }

    public List<String> getGameResult() {
        return gameResult;
    }

    private void validateHeight(int height) {
        if (height < 1) {
            throw new IllegalArgumentException("사다리 높이는 1 이상이어야한다");
        }
    }
}
