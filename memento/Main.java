package memento;

public class Main {
    public static void main(String[] args) {
        Originator editor = new Originator();
        CareTaker history = new CareTaker();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }

}
