package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer =  new Customer();
        customer.setName("Sam");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel()); //.toString()\
        System.out.println(customer.getLevel().getDescription());

        // Convert ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        // Konversi ke tipe object Level
        Level level = Level.valueOf("PREMIUM"); //Harus sama dengan yg terdapat pada list enum
        System.out.println(level);
        System.out.println("");

        System.out.println("Print level:");
        for(var value:Level.values()){
            System.out.println(value);
        }

    }
}
