package view;

import domain.Car;
import domain.Participant;
import domain.Winner;

import java.util.List;
import java.util.StringJoiner;

public class PlayView {

    public static void racingView(Participant participant){
        StringBuffer sb = new StringBuffer();
        List<Car> participants = participant.getParticipants();

        for(Car participantsCar : participants){
            setPlayerView(sb, participantsCar);
        }

        System.out.println(sb.toString());
    }

    public static void setPlayerView(StringBuffer sb, Car car){
        sb.append(car.getCarName()).append(": ");
        for(int distance = 0; distance < car.getCarMoveDistance(); distance++){
            sb.append("-");
        }
        sb.append("\r\n");
    }

    public static void resultView(Winner winner){
        List<Car> winners = winner.getWinners();
        StringJoiner sj = new StringJoiner(",");
        for(Car winCar : winners){
            sj.add(winCar.getCarName());
        }
        System.out.println(sj.toString() + "가 최종우승 했습니다.");
    }

}
