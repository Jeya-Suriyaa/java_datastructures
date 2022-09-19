//Through this code we will cover two important operations of stack , 
// which are PUSH and PULL
import java.util.*;
public class STExample {

    public static void main(String args[]){
             
        
        Stack<String> Crypto_Stack = new Stack<String>();
        Crypto_Stack.push("bitcoin");
        Crypto_Stack.push("Ethereum");
        Crypto_Stack.push("ShibaInu");

        Iterator itr = Crypto_Stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
    
}