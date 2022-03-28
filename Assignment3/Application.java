package Assignment3;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        BiFunction <String ,String> upperCase = a -> a.toUpperCase(Locale.ROOT);
        System.out.println("upperCase.apply(\"husam\") = " + upperCase.apply("husam"));
    }
}
