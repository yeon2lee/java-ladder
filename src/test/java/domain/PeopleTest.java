package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PeopleTest {

    @Test
    public void 참여자가_두명_미만이면_예외_발생() {
        List<String> names = List.of("pobi");

        Assertions.assertThrows(IllegalArgumentException.class, () -> new People(names));
    }

}
