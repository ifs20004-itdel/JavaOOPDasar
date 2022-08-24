package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.*;

@Fancy(name = "AnimallApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
