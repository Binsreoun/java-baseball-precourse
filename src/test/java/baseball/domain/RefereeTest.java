package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    private Referee referee;
    private static final List<Integer> ANSEW = Arrays.asList(1, 2, 3)

    @BeforeEach
    void setup(){
        referee = new Referee();
    }
    @Test
    void 스트라이크3() {
        String result = referee.compare(ANSEW, Arrays.asList(1,2,3));
        assertThat(result).isEqualTo("0 볼 3 스트라이크");
    }

    @Test
    void 아웃() {
        String result = referee.compare(ANSEW, Arrays.asList(4,5,6));
        assertThat(result).isEqualTo("아웃");
    }

    @Test
    void 볼3() {
        String result = referee.compare(ANSEW, Arrays.asList(2,3,1));
        assertThat(result).isEqualTo("3 볼 0 스트라이크");
    }

    @Test
    void 볼2스트라이크1() {
        String result = referee.compare(ANSEW, Arrays.asList(1,3,2));
        assertThat(result).isEqualTo("2 볼 1 스트라이크");
    }
}