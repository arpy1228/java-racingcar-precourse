package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarNameTest {

    @Test
    @DisplayName("자동차이름 정상 케이스 테스트")
    public void carNameTest(){
        CarName carName = new CarName("tesss");
        assertThat(carName.getCarName()).isEqualTo("tesss");

    }

    @Test
    @DisplayName("자동차이름 비정상 케이스 테스트")
    public void carNameExceptionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new CarName("testee"));

        assertEquals("자동차 이름은 1 이상 5 이하여야 합니다.", exception.getMessage());

    }

}