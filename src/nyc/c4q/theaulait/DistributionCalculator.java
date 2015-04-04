package nyc.c4q.theaulait;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Created by c4q-vanice on 4/3/15.
 */
public class DistributionCalculator
{
    public static void main(String[] args)
    {
        
    }

    public ArrayList<Double> calculate(File textFile) throws FileNotFoundException
    {
        ArrayList<Double> percentage = new ArrayList<Double>();
        Map<Character, Integer> counts = new HashMap<Character, Integer>();

        // Need to convert file into a string and lower cases then read through the file.
        String file = textFile.toString();
        file = file.toLowerCase();
        Scanner input = new Scanner(file);

        //Look for characters and set the value.
        while(input.hasNext())
        {
            String word = input.next();
            for(int i = 0; i < word.length(); i++)
            {
                char c = word.charAt(i);
                if(counts.containsKey(c))
                {
                    counts.put(c, counts.get(c) + 1);
                }
        // I know there is another method needed to calculate the percentage.
        // However I do not understand enough to know how, so I will continue to
        // work on the problem.

                }
            } return percentage;

        }
    }

