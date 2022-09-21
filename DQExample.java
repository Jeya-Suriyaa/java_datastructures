//Using Dequeue we can add and remove from both ends.
//Through this example we will just see methods that differ from priority queue
//peekFirst() - returns head element ,  does not remove , Null is returned if empty
//peekLast()  - returns last element ,  does not remove , Null is returned if empty
//offerFirst()- insert at front  return true or false.
//offerLast() - insert at back   return true or false.

import java.util.*;

public class DQExample {

    public static void main(String args[]){

        Deque<String> CryptoDQ = new ArrayDeque<String>();
        CryptoDQ.add("Ethereum");
        CryptoDQ.add("Bitcoin");
        CryptoDQ.add("ShibaInu");
        CryptoDQ.add("Dogecoin");
        CryptoDQ.add("Litecoin");

        Iterator itr = CryptoDQ.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("head:"+CryptoDQ.peekFirst());
        System.out.println("tail:"+CryptoDQ.peekLast());

        System.out.println("Lets add from head");
        CryptoDQ.offerFirst("BiananceCoin");
        System.out.println("Lets add from end");
        CryptoDQ.offerLast("Cardano");

        System.out.println("Lets print the new deque");

        Iterator itr2 =  CryptoDQ.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());                                                                                     
        }
         
    }

}