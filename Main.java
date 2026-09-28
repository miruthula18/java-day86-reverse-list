import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Bala");
        names.add("Cathy");
        names.add("David");
        System.out.println("Before: " + names);
        Collections.reverse(names);
        System.out.println("After: " + names);
    }
}