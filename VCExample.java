import java.util.*;
public class VCExample {

    public static void main(String args[]){
             
        
        Vector<String> Cryptos = new Vector<String>();
        Cryptos.add("bitcoin");
        Cryptos.add("Ethereum");
        Cryptos.add("ShibaInu");

        //Enumeration only in forward direction
        //Legacy classes use enumeration interface.
        Enumeration en=Cryptos.elements();  
        while(en.hasMoreElements()){  
         System.out.println(en.nextElement());  
        }  

        if(Cryptos.contains("ShibaInu")){
            System.out.println("ShibaInu is present at the index " +Cryptos.indexOf("ShibaInu")); 
        }
        else  
        {  
           System.out.println("SibaInu is not present in the list.");  
        }  


    }
    
}