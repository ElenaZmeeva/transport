import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car1= new Car("Audi","A6", 2018,"Germany","black", 250 );
        Car car2= new Car("BMW","X5", 2022,"Germany","white", 245 );
        Car car3= new Car("Toyota","Rav4", 2022,"Japan","grey", 204 );

        Bus bus1= new Bus("Mercedes-Benz", "Sprinter", 2018,"Germany","black", 180 );
        Bus bus2= new Bus("Yutong", "ZK6122H9", 2022,"China","black", 180 );
        Bus bus3= new Bus("Yutong", "ZK612", 2020,"China","grey", 180 );

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }

}