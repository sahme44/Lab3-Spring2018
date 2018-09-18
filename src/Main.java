public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Here");
       // System.out.println(WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        System.out.println(WebScraper.wordCount("http://erdani.com/tdpl/hamlet.txt"));
        System.out.println(WebScraper.oneWordCount("http://erdani.com/tdpl/hamlet.txt", "prince"));
    }
}
