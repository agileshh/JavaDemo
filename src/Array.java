public class Array
{
    public static void main(String[] args)
    {
        int a[]= {100, 900,300,100,100}; //Can store only single datatype
        String hello[] = {"Hi","Hello","Agileshh","Tamil","Anu"};
        // System.out.println(a[3]); //ArrayIndexOutOfBoundsException
        System.out.println(a[1]);
        // System.out.println(hello[3]);
        for(String helloo: hello)
        {
            System.out.println(helloo);
        }
        Object demo[] = {1,'a',"QWERTY",9900};
        for(Object demoo: demo)
        {
            System.out.println(demoo);
        }
        //Finding the number of repeatation
        int num = 100;
        int count = 0;
        for(int b: a)
        {
           if(b == num)
           {
               count++;
           }
            System.out.println(count);
        }
    }
}
