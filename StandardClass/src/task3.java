
public class task3 {

    public static void main(final String[] args) {
        String message = "ABCDEFG";
        System.out.println("元の文字列： " + message);
        System.out.println("文字数： " + message.length());
        System.out.print("文字列(逆)： ");
        for(int i = message.length() - 1; i >= 0; i--) {
            System.out.print(message.charAt(i));
        }
    }

}
