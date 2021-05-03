package domain;

public class Car {

    public static final int CAR_MOVE_CHECK = 4;
    public static final int CAR_ADVANCE = 1;
    public static final int CAR_STOP = 0;

    private CarName carName;
    private CarDistance carDistance;

    public Car(String carName){
        this.carName = new CarName(carName);
        carDistance = new CarDistance();
    }

    public void setCarBehavior(int randomNumber){
        if(randomNumber >= CAR_MOVE_CHECK){
            move(()-> CAR_ADVANCE);
            return;
        }

        move(()-> CAR_STOP);
    }

    public void move(CarBehavior carBehavior){
        carDistance.changedCarMoving(carBehavior.carMove());
    }

    public int getCarMoveDistance(){
        return carDistance.getCarMovingDistance();
    }

    public String getCarName(){
        return this.carName.getCarName();
    }

}

