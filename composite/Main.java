package composite;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group();
        group1.add(new Shape());// imaginary square
        group1.add(new Shape());// imaginary square

        Group group2 = new Group();

        group2.add(new Shape());// imaginary circle
        group2.add(new Shape());// imaginary circle

        Group group = new Group();

        group.add(group1);
        group.add(group1);

        group.render();
    }
}
