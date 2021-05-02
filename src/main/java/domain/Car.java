package domain;

public class Car {

    private CarName carName;
    private CarDistance carDistance;

    public Car(String carName){
        this.carName = new CarName(carName);
        carDistance = new CarDistance();
    }

    public void move(CarBehavior carBehavior){
        carDistance.changedCarMoving(carBehavior.carMove());
    }

    public int getCarMoveDistance(){
        return carDistance.getCarMovingDistance();
    }


}

