package nyc.c4q.theaulait;
/**
 * Created by c4q-vanice on 4/3/15.
 */
// I am not sure if it produced the output the assignment asked for but it did not give me an error.

import java.net.URL;
import java.util.Scanner;

public class WebPageSanitizer
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a URL.");
        String user = input.nextLine();
        String html = url(user);
        System.out.println(sanitize(html));

    }
    //This method reads the url as a string from the start to the end and deletes the "scripts" and replace them with whitespace.
    public static String sanitize(String html)
    {
        String replacement = "";
        while(html.contains("<script"))
        {
            int start = html.indexOf("<script");
            int end = html.indexOf("/script>", start);
            String delete = html.substring(start, end);
            html = html.replace(delete, replacement);
        }
        return html;
    }
    // I was told to incorporate Alex S's HTTP method to convert the string into URL.
    public static String url(String html)
    {
        URL url = HTTP.stringToURL(html);
        String webpage = HTTP.get(url);
        return webpage;

    }
}



