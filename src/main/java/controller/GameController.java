package controller;

import domain.Car;
import util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    List<Car> joinCar;

    public GameController(){
        joinCar = new ArrayList<>();
    }

    public void init(){
        List<String> carNames = inputParticipantCarName();
        for(int partitions = 0; partitions < carNames.size(); partitions++){
            joinCar.add(new Car(carNames.get(partitions)));
        }

    }

    public void playGame(){
//        System.out.println("시도할회수는몇회인가요?");
    }

    public List<String> inputParticipantCarName(){
        System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
        Scanner sc = new Scanner(System.in);
        return StringUtil.participateGame(sc.nextLine());

    }

}
