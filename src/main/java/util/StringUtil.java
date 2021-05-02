package util;

import java.util.Arrays;
import java.util.List;

public class StringUtil {

    public static List<String> participateGame(String carNames){
        return Arrays.asList(carNames.split(","));
    }

}
