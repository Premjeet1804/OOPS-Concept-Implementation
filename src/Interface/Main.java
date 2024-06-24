package Interface;

import javax.sql.XAConnection;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.acc();
//        car.stop();
//        car.start();
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.statMusic();
        car.upgradeEngine(new ElectricEngine());

    }
}
