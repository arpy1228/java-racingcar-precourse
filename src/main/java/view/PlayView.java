package view;

import domain.Car;
import domain.Participant;

public class PlayView {

    public static void racingView(Participant participant){
        StringBuffer sb = new StringBuffer();
        for(int players = 0; players < participant.getParticipantsCount(); players++){
            setPlayerView(sb, participant.getParticipants().get(players));
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

    public static void resultView(Participant participant){
        StringBuffer sb = new StringBuffer();
        for(int winnerCount = 0; winnerCount < participant.getParticipantsCount(); winnerCount++){
            sb.append(participant.getParticipants().get(winnerCount).getCarName()).append(",");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("가 최종 우승했습니다.");
        System.out.println(sb.toString());

    }

}
