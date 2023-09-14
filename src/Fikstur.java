import jdk.jshell.execution.Util;

import java.util.*;

public class Fikstur
{
    HashMap<Integer,String> takimList;
    ArrayList<String> takim;
    int dizi[];

    Fikstur()
    {
        this.takimList = new HashMap<>();
        takim = new ArrayList<>();

    }

    public void printFikstur(HashMap<String,String> hm)
    {
        for(Map.Entry<String,String> set: hm.entrySet())
        {
            int i=1;
            System.out.println("Hafta "+i++);
            System.out.println(set.getKey()+" - "+set.getValue());
        }
    }




}
