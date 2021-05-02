package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    @DisplayName("자동차 전진 테스트")
    public void carMoveFowardTest(){
        Car car = new Car("test");
        car.move(()->1);
        assertThat(car.getCarMoveDistance()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 정지 테스트")
    public void carMoveStopTest(){
        Car car = new Car("test");
        car.move(()->1);
        car.move(()->0);
        assertThat(car.getCarMoveDistance()).isEqualTo(1);
    }

}
