import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! " + System.getProperty("java.version") );

        // unnamed var _ underscore
        Cat _ = new Cat();

        try {
            int myInit = Integer.parseInt("sss");
        } catch (NumberFormatException _) { // ignores

        }

        List<Cat> cats = List.of(new Cat(), new Cat(), new Cat());
        cats.forEach(_ -> System.out.println("Yay Cats"));

    }

    // String
    String name = "Paul";
    int age = 21;
    String message = STR."Hello \{name} age is \{age}";



}

