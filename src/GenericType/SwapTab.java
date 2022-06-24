package GenericType;

import java.util.Arrays;

public class SwapTab {
public static <T> void swap(T[] tab, int x, int y){
    if ((x>=0 && x< tab.length)&&(y >=0 && y< tab.length)){
        T tmp = tab[x];
        tab[x] = tab[y];
        tab[y] = tmp;
    }
}

    public static void main(String[] args) {
        String[] strings = new String[2];
        strings[0] = "test";
        strings[1] = "test2";
        System.out.println("Before "+ Arrays.toString(strings));
        SwapTab.swap(strings,0,1);
        System.out.println("after "+ Arrays.toString(strings));
    }
}
