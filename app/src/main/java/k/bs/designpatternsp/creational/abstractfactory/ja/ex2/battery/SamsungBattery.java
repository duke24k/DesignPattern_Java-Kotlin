package k.bs.designpatternsp.creational.abstractfactory.ja.ex2.battery;

public class SamsungBattery implements Battery {
    @Override
    public int getPower() {
        System.out.println("spent energy of samsung battery");
        return 10;
    }
}
