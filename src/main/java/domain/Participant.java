package domain;

import util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Participant {

    List<Car> participants;

    public Participant(){
        participants = new ArrayList<>();
    }

    public List<Car> getParticipants(){
        return this.participants;
    }

    public void inputParticipants(List<String> inputParticipants) {

        for(int i = 0; i < inputParticipants.size(); i++){
            participants.add(new Car(inputParticipants.get(i)));
        }

    }

    public void inputParticipantCarName(){
        System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
        Scanner sc = new Scanner(System.in);
        inputParticipants(StringUtil.participateGame(sc.nextLine()));
    }


}
