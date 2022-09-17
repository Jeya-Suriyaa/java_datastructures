import java.util.*;


public class LLExample {
    public static void main(String[] args){

        List<Crypto> cryptoLL = new LinkedList<Crypto>();
        Crypto c1= new Crypto("Bitcoin", "Satoshi Nakamoto");
        Crypto c2= new Crypto("Ethereum", "Vitalik Buterin");
        cryptoLL.add(c1);
        cryptoLL.add(c2);

        for(Crypto c:cryptoLL){
            System.out.println(c.name+" "+c.founder);
        }
      



    }
 
}

class Crypto{
    String name;
    String founder;
    public Crypto(String name, String founder ) {  
    this.name = name;  
    this.founder = founder;
}
}