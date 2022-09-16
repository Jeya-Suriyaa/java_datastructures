import java.util.*;
public class ALExample {

    public static void main(String args[]){
             
        
        ArrayList<String> Cryptos = new ArrayList<String>();
        Cryptos.add("bitcoin");
        Cryptos.add("Ethereum");
        Cryptos.add("ShibaInu");

        Iterator itr = Cryptos.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
    
}
