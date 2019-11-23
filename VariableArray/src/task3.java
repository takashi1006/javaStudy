import java.util.HashMap;

public class task3 {

    public static void main(final String[] args) {
        HashMap<String, Integer> fruitPriceMap = new HashMap<>();
        fruitPriceMap.put("りんご", 130);
        fruitPriceMap.put("みかん", 120);
        fruitPriceMap.put("バナナ", 98);
        fruitPriceMap.put("メロン", 6000);
        for (HashMap.Entry<String, Integer> fruit : fruitPriceMap.entrySet()) {
            System.out.println(fruit.getKey() + " : " + fruit.getValue() + "円");
        }
    }

}
