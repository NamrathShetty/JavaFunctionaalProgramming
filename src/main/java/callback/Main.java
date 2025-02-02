package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello ("James", "Bond", value -> {
            System.out.println("No last name provided for " + value);
        });

        hello ("James", null, value -> {
            System.out.println("No last name provided for " + value);
        });

        hello2 ("James", null, () -> {
            System.out.println("No last name provided");
        });

    }
        static void hello (String firstName, String lastName, Consumer<String> callback) {
            System.out.println(firstName);
            if (lastName != null){
                System.out.println(lastName);
            } else {
                callback.accept(firstName);
            }
        }

        static void hello2 (String firstName, String lastName, Runnable callback) {
            System.out.println(firstName);
            if (lastName != null){
                System.out.println(lastName);
            } else {
                callback.run();
            }
        }
}
