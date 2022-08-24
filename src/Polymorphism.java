public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Jacob");
        employee.sayHello("Budi");

        employee = new VicePresident("Jonggol");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Jacob"));
        sayHello(new VicePresident("Jonggol"));
    }

    static void sayHello( Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello VP "+ vp.name);
        }
        else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+ manager.name);

        }else
            System.out.println("Hello "+ employee.name);
    }

}
