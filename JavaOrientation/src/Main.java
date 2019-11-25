
public class Main {

    public static void main(final String[] args) {
        System.out.println("インスタンスを生成していない状態");
        System.out.println(Person.wallet + "円持っています。");
        
        new Person(1000);
        System.out.println("インスタンスpersonAでwalletにアクセス");
        System.out.println(Person.wallet + "円持っています。");

        new Person(2000);
        System.out.println("インスタンスpersonBでwalletにアクセス");
        System.out.println(Person.wallet + "円持っています。");
        System.out.println("クラスpersonでwalletにアクセス");
        System.out.println(Person.wallet + "円持っています。");
    }

}
