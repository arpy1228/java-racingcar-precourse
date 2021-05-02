package controller;

import domain.Car;
import domain.Participant;
import util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    Participant participant;

    public GameController(){
        participant = new Participant();
    }

    public void init(){
        participant.inputParticipantCarName();
    }

    public void playGame(){

    }


}
