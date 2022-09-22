//unique elements
//allows null values
//no insertion order

import java.util.*;
public class HSExample {
    public static void main(String[] args) {
        HashSet<String> crypHS = new HashSet<String>();
        crypHS.add("Binance");
        crypHS.add("Coinbase");
        crypHS.add("FTX");
        crypHS.add("Bybit");
        System.out.println(crypHS);
        
        //define set2 and add elements
        //other methods like crypHS.addAll(set2) , crypHS.removeAll(set2);
        //define list and add elemets
        //HashSet<String> set3 = new HashSet(list)
    }
}
