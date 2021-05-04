package domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    List<Car> winners;

    public void createWinnerData(List<Car> participant, int winnerDistance){
        winners = new ArrayList<>(participant);
        winners.removeIf(winner -> winner.getCarMoveDistance() != winnerDistance);
    }

    public List<Car> getWinners(){
        return winners;
    }

}
