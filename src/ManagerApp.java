public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Eko");
        manager.sayHello("Budi");

        var vp = new VicePresident("Joko");
        vp.sayHello("Eko");

        System.out.println(manager.toString());
        System.out.println(vp.toString());
    }
}
