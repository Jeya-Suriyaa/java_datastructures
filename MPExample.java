// each key value pair is an entry


import java.util.*;


public class MPExample{
    public static void main(String[] args){

        HashMap<Integer,String> CMap = new HashMap<Integer,String>();
        CMap.put(1,"Ethereum");
        CMap.put(2,"Bitcoin");
        CMap.put(3,"ShibaInu");


        for(Map.Entry mp : CMap.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }
    
    }
 
}


