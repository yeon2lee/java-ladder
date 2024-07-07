package domain;

import java.util.Random;

public class LineGenerator {
    Random random = new Random();

    public boolean generate(boolean value) {
        if (value) {
            return false;
        }
        return random.nextBoolean();
    }
}
