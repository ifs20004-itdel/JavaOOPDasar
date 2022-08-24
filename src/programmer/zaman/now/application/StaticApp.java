package programmer.zaman.now.application;

// Static Import
import static programmer.zaman.now.data.Application.PROCESSORS;
import static programmer.zaman.now.data.Constant.*;
// Standard Import
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APLLICATION);
        System.out.println(VERSION);

//        Without static Import
//        System.out.println(Constant.APLLICATION);
//        System.out.println(Constant.VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,2,3,5)
        );

        Country.City city = new Country.City();
        city.setName("Laguboti");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
