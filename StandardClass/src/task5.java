
public class task5 {

    public static void main(final String[] args) {
        String message = "cat_mouse_mouse_cat_cat";
        System.out.println("元の文字列： " + message);
        String[] messageArray = message.split("_");
        String answerString = "";
        for (int i = 0; i < messageArray.length; i++) {
            System.out.println("文字列(配列)： " + messageArray[i]);
            String searchString = messageArray[i];
            int answerNumber = 0;
            for (int j = 0; j < messageArray.length; j++) {
                int number = 0;
                if ( i != j && messageArray[j].equals(searchString)) {
                    number++;
                }
                if (number > answerNumber) {
                    answerString = messageArray[i];
                }
            }
        }
        System.out.println("文字列は" + answerString + "の方が多い！");
    }

}
