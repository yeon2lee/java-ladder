package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void 참여자_수에_따라_디딤판_생성() {
        int n = 5;
        Assertions.assertEquals(4, new Line(n).getLayerSize());
    }

    @Test
    void 가로_라인이_겹치지_않게_한다() {
        boolean value = true;
        LineGenerator generator = new LineGenerator();
        Assertions.assertEquals(false, generator.generate(value));
    }
}
