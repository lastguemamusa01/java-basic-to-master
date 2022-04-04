import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

        cars.add("Volvo");
        cars.add("Hyundai");
        cars.add("Volvo");

        System.out.println(cars.contains("Volvo")+"\n");

        for(String car: cars) {
            System.out.println(car);
        }
        System.out.println("\n");

        cars.remove("Hyundai");
        System.out.println(cars.size()+"\n");

        cars.clear();
        System.out.println(cars.size()+"\n");

        

    }
}
