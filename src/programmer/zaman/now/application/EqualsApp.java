package programmer.zaman.now.application;

public class EqualsApp {

    public static void main(String[] args) {
        String first = "Eko";
        first = first +" "+ "Khannedy";

        String second = "Eko Khannedy";

        String third = "Eko Khannedy";

        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
