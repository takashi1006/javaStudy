import java.util.HashMap;

public class task1 {

    public static void main(final String[] args) {
        HashMap<String, String> questions = new HashMap<>();
        questions.put("A", "処理を短くでき、コードをスッキリすることができる。");
        questions.put("B", "部品化しているので、修正時の手間が省ける。");
        questions.put("C", "複数人での開発時に他人の作成した処理を流用できる。");
        HashMap<String, String> answers = new HashMap<>();
        answers.put("A", "◯");
        answers.put("B", "◯");
        answers.put("C", "△ 流用、再利用は間違いないが、間違っている可能性もあるのため、注意が必要");
        for (HashMap.Entry<String, String> question : questions.entrySet()) {
            System.out.println(question.getKey() + ". " + question.getValue());
            System.out.println(answers.get(question.getKey()));
        }
    }

}
