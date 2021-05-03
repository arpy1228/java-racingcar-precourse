package controller;


import domain.Participant;
import domain.PlayNumber;
import util.RandomNumberUtil;
import view.PlayView;

public class GameController {

    Participant participant;
    PlayNumber playNumber;

    public GameController(){
        participant = new Participant();
        playNumber = new PlayNumber();
    }

    public void init(){
        participant.inputParticipantCarName();
        playNumber.inputRaceCount();
        playGame();
    }

    public void playGame(){

        for(int round = 0; round < playNumber.getRaceCount(); round++){
            playerMove();
            PlayView.racingView(participant);
        }

        participant.winnerCarPlayer();
        PlayView.resultView(participant);

    }

    public void playerMove(){
        for(int players = 0; players < participant.getParticipantsCount(); players++){
            participant.setCarMoveDistance(players, RandomNumberUtil.makeRandomNumber());
        }
    }

}
