public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public Person(String name){
        this(name, "Jakarta");
    }
    public Person(){
        this("Ucok");
    }


    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is "+ name);
    }
}
