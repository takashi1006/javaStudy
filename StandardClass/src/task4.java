
public class task4 {

    public static void main(final String[] args) {
        String message = "ABCDGOPQRSYZ";
        System.out.println("元の文字列： " + message);
        String searchString = "AY";
        searchCharacterDispaly(message, searchString);
        searchString = "AB";
        searchCharacterDispaly(message, searchString);
        searchString = "G";
        searchCharacterDispaly(message, searchString);
    }

    public static void searchCharacterDispaly(String string, String searchString) {
        System.out.println("探したい文字列： " + searchString);
        if (string.indexOf(searchString) != -1) {
            System.out.println( string + "は文字列:" + searchString + "を含む");
        } else {
            System.out.println( string + "は文字列:" + searchString + "を含まない");
        }
    }

}
