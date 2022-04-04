import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("England", "London2");
        
        System.out.println(capitalCities.get("England")+"\n");
        capitalCities.remove("England");
        
        System.out.println(capitalCities.size()+"\n");

        capitalCities.clear();
        
        System.out.println(capitalCities.size()+"\n");

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");

        for(String i: capitalCities.keySet()) {
            System.out.println(i);
        }
        System.out.println("\n");

        for(String i: capitalCities.values()) {
            System.out.println(i);
        }
        System.out.println("\n");

        for(String i: capitalCities.keySet()) {
            System.out.println("key "+i+" of value is "+ capitalCities.get(i));
        }
        System.out.println("\n");
        
    }

}
