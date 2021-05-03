package domain;

import java.util.Scanner;

public class PlayNumber {

    private int raceCount;

    public void PlayNumber(){
        raceCount = 0;
    }

    public int getRaceCount(){
        return this.raceCount;
    }

    public void inputRaceCount(){
        Scanner sc = new Scanner(System.in);
        try{
            raceCount = checkRaceCountBoundary(Integer.parseInt(sc.nextLine()));
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public int checkRaceCountBoundary(int raceCount){
        if(raceCount <= 0){
            throw new IllegalArgumentException("경주 횟수는 1 이상이어야 합니다.");
        }
        return raceCount;
    }


}
