public class PersonApp {
    public static void main(String[] args) {
        var p1 = new Person("Eko");
        System.out.println(p1.name + " " + p1.address + " " + p1.country);
        p1.sayHello("Budi");

        Person p2;
        p2 = new Person("Ichi", "Balige");
        System.out.println(p2.name + " " + p2.address + " " + p2.country);
        p2.sayHello("Timoy");

        var p3  = new Person();
        System.out.println(p3.name+" "+ p3.address + " "+ p3.country);
        p3.sayHello("Geralt");
    }
}
