//maintains insertion order
import java.util.*;
public class LHExample {
    public static void main(String[] args) {
        LinkedHashSet<String> CLHS = new LinkedHashSet<String>();
        //methods that we will see:
        CLHS.add("Binance");
        CLHS.add("Coinbase");
        CLHS.add("FTX");
        CLHS.add("Bybit");
        System.out.println(CLHS);
    }
}
