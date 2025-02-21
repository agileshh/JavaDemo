import java.util.*;

public class Collections
{
    public static void main(String[] args)
    {
        /////////////////LIST///////////////////////////
        //Declaring the ArrayList
        ArrayList Exa1 = new ArrayList();
        //Storing date in to arraylist (Heterogeneous)
        Exa1.add(100);
        Exa1.add('a');
        Exa1.add("Lumel");
        Exa1.add("hello");
        Exa1.add(true);
        //Inserting and Printing the data
        Exa1.add(3,99);
        System.out.println("Print the data :" + Exa1);
        //Modify the data
        Exa1.set(2,"murai");
        System.out.println("Print the data :" + Exa1);
        //printing all the data
        for(Object x : Exa1)
        {
            System.out.println(x);
        }

        ////////////////SET///////////////////////////////
        Set myset = new HashSet();
        myset.add(100);
        myset.add(true);
        myset.add(100);
        myset.add("DAWddw443grg");

        for(Object Y: myset)
        {
            System.out.println(Y);
        }

        //////////////////////MAP////////////////
        HashMap mymap = new HashMap();
        mymap.put(100, "agileshh");
        mymap.put(101, "agileshh");
        mymap.put(101, "agileshh");//Does not allow duplicate keyword but allow duplicate value
        mymap.put(001, "Tamil");
        System.out.println()





    }
}
