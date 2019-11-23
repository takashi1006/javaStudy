import java.util.ArrayList;

public class task5 {

    public static void main(final String[] args) {
        ArrayList<String> params = new ArrayList<>();
        params.add("北海道");
        params.add("東北");
        params.add("関東");
        params.add("中部");
        params.add("近畿");
        params.add("中国");
        params.add("九州");
        displayResult(findNull(params));
        params.add(null);
        displayResult(findNull(params));
    }

    public static boolean findNull(ArrayList<String> params) {
        boolean findFlg = false;
        for (int i = 0; i < params.size(); i++) {
            if(params.get(i) == null) {
                findFlg = true;
                break;
            };
        }
        return findFlg;
    }

    public static void displayResult(boolean findFlg) {
        if (findFlg) {
            System.out.println("nullが含まれています。");
        } else {
            System.out.println("nullが含まれていません。");
        }
    }

}
