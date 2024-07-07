package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void 참여자_수에_따라_디딤판_생성() {
        int n = 5;
        Assertions.assertEquals(4, new Line(n).getLayerSize());
    }
}
