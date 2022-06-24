package GenericType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListyDoM {
    public static void main(String[] args) {
        List<String> list1 =  new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        list1.add("kowalski");
        list1.add("nowak");
        list1.add("lewandowski");
        list1.add("żyła");
        list1.add("kubacki");
        list2.add("kiepski");
        list2.add("paździoch");
        list2.add("boczek");
        list2.add("cezary");
        for (String item : list1){
            list3.add(item);
        }
        for(String item : list2){
            list3.add(item);
        }
        List<String> list4 = new ArrayList<>();
        for(String item : list3)
            if(item.contains("ski")){
                list4.add(item);
            }
        list3.removeAll(list4);

        System.out.println((list3));
    }
}
