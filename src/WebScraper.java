import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public class WebScraper {

    public static void main(String[] unused) {
        System.out.println("Run");
    }

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int wordCount(final String url) {
        String temp = urlToString(url);
        int count = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int oneWordCount(final String url, String word) {
        String temp = urlToString(url);
        int lengthWord = word.length();
        int count = 0;
        for (int i = 0; i < temp.length()- lengthWord; i++) {
            if (word.toLowerCase().equals(temp.substring(i, i + lengthWord).toLowerCase())) {
                count++;
            }

        }
        return count;
    }
}