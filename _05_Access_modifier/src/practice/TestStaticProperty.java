package practice;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars+" Name: "+car1.getName()+", Engine: "+car1.getEngine());

        Car car2 = new Car();
        car2.setName("Mazda 6");
        car2.setEngine("Skyactiv 6");
        System.out.println(Car.numberOfCars + " Name: "+car2.getName() +", Engine: " +car2.getEngine());

    }
}
