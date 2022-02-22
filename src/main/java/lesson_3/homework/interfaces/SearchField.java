package lesson_3.homework.interfaces;

public interface SearchField {
    default void find(String word) {
        System.out.println("Ищу <"+ word + ">: Результат...");
    }
}
