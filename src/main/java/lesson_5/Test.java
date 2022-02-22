package lesson_5;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Comparator comparator = new Comparator("text");
        Function<Comparator, Boolean> function = Comparator::equals;

        System.out.println();
    }

    public static Consumer<String> getConsumer() {
        return text -> System.out.println(text);
    }

}
