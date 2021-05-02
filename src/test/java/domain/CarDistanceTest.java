package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarDistanceTest {

    @Test
    public void distanceMoveUpTest(){
        CarDistance carDistance = new CarDistance();
        carDistance.changedCarMoving(1);
        assertThat(carDistance.getCarMovingDistance()).isEqualTo(1);
        carDistance.changedCarMoving(0);
        assertThat(carDistance.getCarMovingDistance()).isEqualTo(1);
    }


}