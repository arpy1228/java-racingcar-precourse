package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayNumberTest {

    @Test
    @DisplayName("경기 횟수 정상 케이스 테스트")
    public void raceCountTest(){
        PlayNumber playNumber = new PlayNumber();
        assertThat(playNumber.checkRaceCountBoundary(2)).isEqualTo(2);
    }

    @Test
    @DisplayName("경기 횟수 비정상 케이스 테스트")
    public void raceCountExceptionTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new PlayNumber().checkRaceCountBoundary(0));
        assertEquals("경주 횟수는 1 이상이어야 합니다.", exception.getMessage());
    }

}