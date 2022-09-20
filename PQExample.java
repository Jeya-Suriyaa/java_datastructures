import java.util.PriorityQueue;
import java.util.*;

public class PQExample {

    public static void main(String args[]){
             
        
        PriorityQueue<String> Crypto_Queue = new PriorityQueue<String>();
        Crypto_Queue.add("bitcoin");
        Crypto_Queue.add("Ethereum");
        Crypto_Queue.add("ShibaInu");
        Crypto_Queue.add("Litecoin");

        //methods
        //add()   - throws an exception if it cant.
        //offer() - returns false
        //remove()- retrieve and remove head of queue   (throws exceptiion)
        //poll()  -  ""                                 (returns null)
        //element()- retrieve but not remove head
        //peek()   -  ""                                (returns null)
        System.out.println("after add");
        Iterator itr = Crypto_Queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Crypto_Queue.remove();

        System.out.println("after remove");
        Iterator itr2 = Crypto_Queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        
        System.out.println("using element()"+Crypto_Queue.element());

        System.out.println("after element()");
        Iterator itr3 = Crypto_Queue.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }





    }
    



    
}
