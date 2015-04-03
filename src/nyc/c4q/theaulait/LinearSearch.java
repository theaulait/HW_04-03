package nyc.c4q.theaulait;

import java.util.ArrayList;

public class LinearSearch
{

    public static void main(String[] args)
    {
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        // test method to see if it returns the number(s)
        //System.out.println(search(test, 6));
        //System.out.println(search(test, 2));
    }

    public static int search(ArrayList<Integer> list, int numx)
    {
        if(list.contains(numx)) // if the list contains the number, it will return the number.
        {
            return numx;
        }
        else

        {
            return - 1;
        }
    }
}
