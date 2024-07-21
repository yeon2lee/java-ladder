package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {

    private List<Boolean> points;

    public Line(int n) {
        List<Boolean> points = new ArrayList<>();
        Random random = new Random();
        boolean before = false;
        for (int i = 0; i < n - 1; i++) {
            boolean line = random.nextBoolean();
            if (before) {
                line = false;
            }
            points.add(line);
            before = line;
        }
        this.points = points;
    }

    public List<Boolean> getPoints() {
        return points;
    }

    public int getLayerSize() {
        return points.size();
    }
}
