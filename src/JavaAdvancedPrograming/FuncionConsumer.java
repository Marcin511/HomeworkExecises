package JavaAdvancedPrograming;

import java.time.LocalTime;
import java.util.function.Consumer;

public class FuncionConsumer {
    Consumer<String> time = (String nowTime) ->{
        String[] timeData = nowTime.split(":");
        System.out.println( timeData[0]);
        System.out.println( timeData[1]);
    };
}
