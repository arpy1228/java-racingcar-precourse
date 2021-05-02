package domain;

public class CarDistance {

    private int carMovingDistance;

    public CarDistance(){
        carMovingDistance = 0;
    }

    public int getCarMovingDistance() {
        return carMovingDistance;
    }

    public void changedCarMoving(int distance){
        this.carMovingDistance += distance;
    }

}
