import java.util.ArrayList;

public class task1 {

    public static void main(final String[] args) {
        ArrayList<String> regions = new ArrayList<>();
        regions.add("北海道");
        regions.add("東北");
        regions.add("関東");
        regions.add("中部");
        regions.add("近畿");
        regions.add("中国");
        regions.add("九州");
        for (int i = 0; i < regions.size(); i++ ) {
            System.out.println(regions.get(i));
        }
    }

}
