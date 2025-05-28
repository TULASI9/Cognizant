import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Alex", "John", "Bob");

        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
