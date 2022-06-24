package GenericType;

import java.util.ArrayList;
import java.util.List;

public class StringToInteger {
    public static void main(String[] args) {
        List<String> ageList =  new ArrayList<>();
        List<Integer> intAgeList = new ArrayList<>();
        ageList.add("18");
        ageList.add("19");
        ageList.add("20");
        ageList.add("39");
        for(String item: ageList){
            int numberAge = Integer.parseInt(item);
            intAgeList.add(numberAge);
        }
        System.out.println("String age list : " + ageList);
        System.out.println("Integer age list : " + intAgeList);
    }

}
