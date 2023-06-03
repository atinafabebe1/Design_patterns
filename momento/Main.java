package momento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }

}
