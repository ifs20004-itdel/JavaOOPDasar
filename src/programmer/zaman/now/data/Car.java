package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name= "Car", tags = {"application", "java"})
public interface Car extends HasBrand {
    void drive();
    String getBrand();
    int getTier();

    default boolean isBig(){
        return true;
    }
}
