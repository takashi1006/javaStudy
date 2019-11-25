
public class task2 {

    public static void main(final String[] args) {
        String message = "Java Programing Training";
        System.out.println("元の文字列： " + message);
        System.out.println("文字数： " + message.length());
        System.out.println("切り取り1： " + message.substring(16, message.length()));
        System.out.println("切り取り2： " + message.substring(0, 15));
        
        String[] messageList = message.split(" ");
        System.out.println("切り取り1(split)： " + messageList[2]);
        System.out.println("切り取り2(split)： " + messageList[0] + " " + messageList[1]);
    }

}
