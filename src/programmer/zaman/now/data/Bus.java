package programmer.zaman.now.data;

public class Bus implements Car {

    @Override
    public void drive() {
        System.out.println("Bus drive");
    }

    @Override
    public String getBrand() {
        return "HINO";
    }

    @Override
    public int getTier() {
        return 8;
    }

    public boolean isBig(){
        return true;
    }
}
