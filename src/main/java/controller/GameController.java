package controller;


import domain.Participant;
import domain.PlayNumber;
import domain.Winner;
import util.RandomNumberUtil;
import view.PlayView;

public class GameController {

    Participant participant;
    PlayNumber playNumber;
    Winner winner;

    public GameController(){
        participant = new Participant();
        playNumber = new PlayNumber();
        winner = new Winner();
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

        winner.createWinnerData(participant.getParticipants(), participant.winnerCarPlayer());

        PlayView.resultView(winner);

    }

    public void playerMove(){
        for(int players = 0; players < participant.getParticipantsCount(); players++){
            participant.setCarMoveDistance(players, RandomNumberUtil.makeRandomNumber());
        }
    }

}
