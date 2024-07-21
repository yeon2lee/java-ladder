package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @DisplayName("올바른 이름을 가진 사람을 생성한다.")
    @Test
    void createTest() {
        // given
        String name = "pobip";

        // when
        Person person = new Person(name);

        // then
        assertThat(person).extracting("name")
                .isEqualTo(name);
    }

    @Test
    public void 사람_이름이_5글자가_넘으면_예외_발생() throws Exception {
        String name = "pobiii";

        assertThrows(IllegalArgumentException.class, () -> new Person(name));
    }
    
    
}
